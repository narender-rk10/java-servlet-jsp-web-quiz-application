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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author narender
 */
public class CheckS extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckS</title>");    
            out.println("<style>\n" +
"  body {\n" +
"  background-color:snow;\n" +
"  color: snow;\n" +
"  background:url(q9.jpg);\n" +
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
"input[type=submit],input[type=reset],input[type=button],button{\n" +
"  width: 45%;\n" +
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
"  div {\n" +
"  background-image: linear-gradient(#093028,#237A57);\n" +
"  border-radius: 21px;\n" +
"  padding: 10px; \n" +
"  width: 650px;\n" +
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
"    width:550px;\n" +
"    height:550px; padding:15px;\n" +
"}\n" +
"table {\n" +
"  border-collapse: collapse;\n" +
"    background-image: linear-gradient(#000428,#004e92);padding:25px;}");
out.println("td,th,tr{padding:15px;}");
out.println("#p1{color:green;font-size:20px}");
out.println("#p2{color:red;font-size:20px}");
out.println("#p3{color:black;font-size:25px}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            
            HttpSession s2=request.getSession(false); 
            String u=(String)s2.getAttribute("name");  
            String v=(String)s2.getAttribute("phnn"); 
            String w=(String)s2.getAttribute("en");   
            String x=(String)s2.getAttribute("occ");  
            String y=(String)s2.getAttribute("uc");  
            String a=(String)s2.getAttribute("uname1");
            String b=(String)s2.getAttribute("sid");
            String c=(String)s2.getAttribute("td");
            
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");   
            response.setHeader("Pragma","no-cache"); 
            response.setHeader ("Expires", "0");
          
            out.println("<form action=\"LogoutS\" method=\"post\">");
            out.println("<center><div>");
            out.println("<center><table border=1 bgcolor=\"#00FF00\">"
                    + "<tr><td colspan='4'> <center>\n" +
" <img class=\"logo-img\" src=\"l1.jpeg\" width=\"230\" height=\"145\" ALT=\"align box\">\n" +
"          </center></td></tr><tr><td colspan='4'><center><h1> REPORT CARD</h1></center></td></tr>"
                    + "<tr><th colspan='4'> NAME OF THE STUDENT: "+u+"</th></tr>"
                            + "<tr><th colspan='4'> TEST DATE AND TIME: "+c+" </th></tr>"
                            + "<tr><th colspan='2'>MOBILE NUMBER: "+v+"</th><th colspan='2'>EMAIL: "+w+"</th></tr>"
                            + "<tr><th colspan='2'>OCCUPATION: "+x+ "</th><th colspan='2'> COUNTRY: "+y+" </th></tr>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
            String query1 = "select * from result where name=? and sesid=?";
            PreparedStatement ps2 = con.prepareStatement(query1);
            ps2.setString(1, a);
            ps2.setString(2, b);
            ResultSet rs1= ps2.executeQuery();
                
            int count=0;
            int e=0;
            while(rs1.next()){
            String  cans=rs1.getString(3);
            String  uans=rs1.getString(4);
            e++;
            if(cans.equals(uans))
            {
                count++;
                out.println("<tr><td colspan='3'><p id='p1'>"+e+"):You have Selected CORRECT Answer MARK:[+1]</p></td></tr>");
            }   
            else{
                count--;
                out.println("<tr><td colspan='3'><p id='p2'>"+e+"):You have Selected INCORRECT Answer MARK:[-1]</p></td></tr>");
            }
            }
            rs1.close();
            ps2.close();
            con.close();
           
            
            out.println("<tr><td colspan='4'><center><p id='p3'>YOUR SCORE IS  "+count+"</p></center></td></tr>");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
            String query2 = "insert into reports values(?,?,?,?);";
            PreparedStatement ps3 = con1.prepareStatement(query2);
            ps3.setString(1,a);
            ps3.setString(2,u);
            ps3.setString(3,c);
            ps3.setInt(4,count);
            ps3.executeUpdate();
            ps3.close();
            con1.close();
            out.println("</table></center><br><br>");
            out.println("<input type=submit value=LOGOUT>");
            out.println("<input type=button onclick=window.location.href='TestReports.jsp' value='CHECK YOUR ALL RESULTS'><br>");
            out.println("<input type=button onclick=window.location.href='ReviewAns.jsp' value='REVIEW THE CORRECT ANSWERS'><br>");
            out.println("</div></center>");
            out.println("<footer>\n" +
"    <center><h1 style=\"color: white\">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>\n" +
"        <h2 style=\"color: white\">Created By: NARENDER KESWANI</h2>\n" +
"    </center>\n" +
"</footer>");
            out.println("</body>");
            out.println("</html>");                
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CheckS.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* TODO output your page here. You may use following sample code. */ 
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