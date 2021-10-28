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
import javax.servlet.http.HttpSession;

/**
 *
 * @author narender
 */
@WebServlet(urlPatterns = {"/UpdateController"})
public class UpdateController extends HttpServlet {

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
            out.println("<title>Servlet UpdateController</title>");            
                        out.println(" <style>\n" +
"  body {\n" +
"  background-color:snow;\n" +
"  color: snow;\n" +
"   background:url(q9.jpg);\n" +
"   background-position: center;\n" +
"  background-repeat: no-repeat;\n" +
"  background-size: cover;\n" +
"  font-family: Arial, Helvetica, sans-serif;\n" +
"   }\n" +
"input[type=text], input[type=password] {\n" +
"  width: 65%;\n" +
"  padding: 15px;\n" +
"  margin: 5px  22px ;\n" +
"  display: inline-block;\n" +
"  border: none;\n" +
"  border-radius: 25px;\n" +
"}\n" +
"input[type=submit],input[type=reset],input[type=button],select{\n" +
"  width: 55%;\n" +
"  padding: 7px;\n" +
"  font-weight:bold;\n" +
"  text-shadow: 2px 2px 5px red;\n" +
"  display: inline-block;\n" +
"  font-size: 16px;\n" +
"  border-radius: 25px;\n" +
"  color:darkgreen;\n" +
"  background-color: darkgreen;\n" +
"  color: white;\n" +
"  border: none;\n" +
"  cursor: pointer;\n" +
"  opacity: 0.9;\n" +
"}\n" +
"input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]{\n" +
"  background-color: #ddd;\n" +
"  outline: none;\n" +
"}\n" +
"div {\n" +
"  background-image: linear-gradient(#093028,#237A57);\n" +
"  border-radius: 21px;\n" +
"  padding: 10px; \n" +
"  width: 550px;\n" +
"  height: 550px;\n" +
"  text-align: center;\n" +
"}\n" +
"ul {\n" +
"  list-style-type: none;\n" +
"  margin: 0;\n" +
"  padding: 0;\n" +
"  overflow: hidden;\n" +
"  background-color: #333;\n" +
"}\n" +
"li {\n" +
"  float: left;\n" +
"  border-right:1px solid #bbb;\n" +
"}\n" +
"li:last-child {\n" +
"  border-right: none;\n" +
"}\n" +
"li a {\n" +
"  display: block;\n" +
"  color: white;\n" +
"  text-align: center;\n" +
"  padding: 14px 16px;\n" +
"  text-decoration: none;\n" +
"}\n" +
"li a:hover:not(.active) {\n" +
"  background-color: #111;\n" +
"}\n" +
".active {\n" +
"  background-color: #4CAF50;\n" +
"}\n" +
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
"table{\n" +
"    width:350px;\n" +
"    height:350px;\n" +
"}\n" +
"table {\n" +
"  border-collapse: collapse;\n" +
"    background-image: linear-gradient(#000428,#004e92);\n" +
"}\n" +
"p{\n" +
"    text-align: left;\n" +
"}\n" +
"</style>\n" +
"    </head>\n" +
"    \n" +
"    <center>\n" +
" <img class=\"logo-img\" src=\"l1.jpeg\" width=\"230\" height=\"145\" ALT=\"align box\">\n" +
"          </center>");
            out.println("<body>");
             HttpSession s2=request.getSession(false);
            String a=(String)s2.getAttribute("tableU");
            String qid =request.getParameter("qid"); 
            String question =request.getParameter("question"); 
            String op1 =request.getParameter("o1"); 
            String op2 =request.getParameter("o2"); 
            String op3 =request.getParameter("o3");            
            String op4 =request.getParameter("o4"); 
            String cans =request.getParameter("cans");
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
           PreparedStatement ps1=null;
                String query = "update "+a+" set question='"+question+"', op_1='"+op1+"' ,op_2='"+op2+"' , op_3='"+op3+"' , op_4='"+op4+"' , c_ans='"+cans+"'  where q_id='"+qid+"'";
                ps1 = con.prepareStatement(query);
                 int i=ps1.executeUpdate();
                 RequestDispatcher rd=request.getRequestDispatcher("UpdatingQQs.jsp");
                    
                    if(i>0){
                        out.println("<center><h2 style=color:green>Sucessfully updated your questions</h2></center>");
                        rd.include(request, response);
                    }
                      out.println("<footer>\n" +
"    <center><h1 style=\"color: white\">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>\n" +
"        <h2 style=\"color: white\">Created By: NARENDER KESWANI</h2>\n" +
"    </center>\n" +
"</footer>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
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
