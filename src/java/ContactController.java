/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author narender
 */
@WebServlet(urlPatterns = {"/ContactController"})
public class ContactController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ContactController</title>");
            out.println("   <style>\n" +
"            body {\n" +
"  background-color:snow;\n" +
"  color: snow;\n" +
"   background:url(q9.jpg);\n" +
"   background-position: center;\n" +
"  background-repeat: no-repeat;\n" +
"  background-size: cover;\n" +
"  font-family: Arial, Helvetica, sans-serif;\n" +
"            }\n" +
"\n" +
"input[type=text], input[type=password] ,input[type=date],input[type=email],textarea {\n" +
"  width: 65%;\n" +
"  padding: 15px;\n" +
"  margin: 5px  22px ;\n" +
"  display: inline-block;\n" +
"  border: none;\n" +
"  border-radius: 25px;\n" +
"}\n" +
"input[type=submit],input[type=reset],input[type=file] {\n" +
"   width: 65%;\n" +
"  padding: 15px;\n" +
"  font-weight:bold;\n" +
"   text-shadow: 2px 2px 5px red;\n" +
"  display: inline-block;\n" +
"    font-size: 16px;\n" +
"    border-radius: 25px;\n" +
"    color:darkgreen;\n" +
"  background-color: darkgreen;\n" +
"  color: white;\n" +
"  border: none;\n" +
"  cursor: pointer;\n" +
"  opacity: 0.9;\n" +
"}\n" +
"input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]:focus{\n" +
"  background-color: #ddd;\n" +
"  outline: none;\n" +
"}\n" +
"button,select,date {\n" +
"     width: 65%;\n" +
"  padding: 15px;\n" +
"  font-weight:bold;\n" +
"   text-shadow: 2px 2px 5px red;\n" +
"  display: inline-block;\n" +
"    font-size: 16px;\n" +
"    border-radius: 25px;\n" +
"    color:darkgreen;\n" +
"  background-color: #ddd;\n" +
"  color: white;\n" +
"  border: none;\n" +
"  cursor: pointer;\n" +
"  opacity: 0.9;\n" +
"}\n" +
"\n" +
"button:hover {\n" +
"  opacity:1;\n" +
"}\n" +
"  div {\n" +
"  background-image: linear-gradient(#093028,#237A57);\n" +
"  border-radius: 21px;\n" +
"  padding: 10px; \n" +
"  width: 550px;\n" +
"  height: 625px;\n" +
"  \n" +
"}\n" +
"ul {\n" +
"  list-style-type: none;\n" +
"  margin: 0;\n" +
"  padding: 0;\n" +
"  overflow: hidden;\n" +
"  background-color: #333;\n" +
"}\n" +
"\n" +
"li {\n" +
"  float: left;\n" +
"  border-right:1px solid #bbb;\n" +
"}\n" +
"\n" +
"li:last-child {\n" +
"  border-right: none;\n" +
"}\n" +
"\n" +
"li a {\n" +
"  display: block;\n" +
"  color: white;\n" +
"  text-align: center;\n" +
"  padding: 14px 16px;\n" +
"  text-decoration: none;\n" +
"}\n" +
"\n" +
"li a:hover:not(.active) {\n" +
"  background-color: #111;\n" +
"}\n" +
"\n" +
".active {\n" +
"  background-color: #4CAF50;\n" +
"}\n" +
"\n" +
".logo-img{\n" +
"    position: relative;\n" +
"    margin: 10px 15px 15px 10px;\n" +
"}.logo-img1{\n" +
"    float:right;\n" +
"    position: relative;\n" +
"    margin: 10px 15px 15px 10px;\n" +
"}\n" +
"footer{\n" +
"    background-color:black;\n" +
"}\n" +
"</style>");
            out.println("</head>");
            out.println("<body>");
             String n=request.getParameter("name");
            String p=request.getParameter("phone");
            String e=request.getParameter("email");
            String f=request.getParameter("fb");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "insert into feedback values(?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(query);
                ps1.setString(1, n);
                ps1.setString(2, p);
                ps1.setString(3, e);
                ps1.setString(4, f);
                int i=ps1.executeUpdate();
                    if(i>0){
                        out.println("<center><h2 style=color:green>Sucessfully your feedback entered with us</h2></center>"); 
                     RequestDispatcher rd1=request.getRequestDispatcher("ContactU.html");
                     rd1.include(request, response);  
                    }
                    else{
                           response.sendRedirect("ContactU.html");
                        }
                       out.println("<footer>\n" +
"    <center><h1 style=\"color: white\">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>\n" +
"        <h2 style=\"color: white\">Created By: NARENDER KESWANI</h2>\n" +
"    </center>\n" +
"</footer>");
            out.println("</body>");
            out.println("</html>");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
