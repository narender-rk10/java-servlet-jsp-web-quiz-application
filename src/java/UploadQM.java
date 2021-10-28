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
import java.util.Enumeration;
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
@WebServlet(urlPatterns = {"/UploadQM"})
public class UploadQM extends HttpServlet {

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
            out.println("<html>");
            out.println("</body>");
            String qid =request.getParameter("qid");
            String question =request.getParameter("question"); 
            String op1 =request.getParameter("op1"); 
            String op2 =request.getParameter("op2"); 
            String op3 =request.getParameter("op3");
            String op4 =request.getParameter("op4"); 
            String cans =request.getParameter("cans"); 
           
            String tt=request.getParameter("tt");
      
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
           
            String query1="insert into "+tt+" values('"+qid+"','"+question+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+cans+"')";
            PreparedStatement ps2 = con.prepareStatement(query1);  
            int i=ps2.executeUpdate();
            RequestDispatcher rd=request.getRequestDispatcher("UQMAddQ.html");
                    
                    if(i>0){
                        out.println("<center><h2>Sucessfully uploaded your questions</h2></center>");
                        rd.include(request, response);
                    }
                    else{
                        out.println("<center><h2>Due to techniclal issue, your request is not processed</h2></center>");
                        rd.include(request, response);
                    } 

                    out.println("</body>");
                    out.println("</html>");
    }   catch (SQLException ex) {
            Logger.getLogger(UploadQM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UploadQM.class.getName()).log(Level.SEVERE, null, ex);
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