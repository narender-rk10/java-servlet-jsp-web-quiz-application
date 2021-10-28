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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
@WebServlet(name = "TableController", urlPatterns = {"/TableController"})
public class TableController extends HttpServlet {

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
            out.println("<title>Servlet TableController</title>");            
            out.println("</head>");
            out.println("<body>");
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");            
            response.setHeader("Pragma","no-cache");
            response.setHeader ("Expires", "0");
            HttpSession s2=request.getSession(false);
           
                List qlist=new ArrayList();
                 List qlist1=new ArrayList();
                Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" ); 
                    PreparedStatement ps = con.prepareStatement("select distinct * from java order by rand() limit 20"); 
                    ResultSet rs = ps.executeQuery()) {
                while(rs.next())
                {
                   String a= rs.getString(1);
                   String b= rs.getString(2);
                   String c= rs.getString(3);
                   String d= rs.getString(4);
                   String e= rs.getString(5);
                   String f= rs.getString(6);
                   String g= rs.getString(7);
                
                 String[] array=new String[]{c,d,e,f};
              List<String> l1=Arrays.asList(array);
              Collections.shuffle(l1);
         
              String k=l1.get(0);
              String l=l1.get(1);
              String m=l1.get(2);
              String n=l1.get(3); 
               
              qlist.add(a);
              qlist.add(b);
              qlist.add(k);
              qlist.add(l);
              qlist.add(m);
              qlist.add(n);
              qlist.add(g);
              
              qlist1.add(k);
              qlist1.add(l);
              qlist1.add(m);
              qlist1.add(n);
                
            }      
                
             s2.setAttribute("qlist",qlist);
             s2.setAttribute("qlist1",qlist1);
             RequestDispatcher rd=request.getRequestDispatcher("MainController.jsp");
            rd.forward(request, response); 
        }
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PrintWriter out = response.getWriter())
        {   HttpSession s2=request.getSession(false);
            String name=(String)s2.getAttribute("uname1");
            String qid=request.getParameter("qid");
            String corans=request.getParameter("corans");
            String option=request.getParameter("option");
            String sesid=s2.getId();
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                    PreparedStatement ps1 = con1.prepareStatement("INSERT INTO RESULT values(?,?,?,?,?)")) {
                ps1.setString(1,name);
                ps1.setString(2,qid);
                ps1.setString(3,corans);
                ps1.setString(4,option);
                ps1.setString(5,sesid);
                int d=ps1.executeUpdate();
            }  
            s2.setAttribute("sid", sesid);
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TableController.class.getName()).log(Level.SEVERE, null, ex);
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