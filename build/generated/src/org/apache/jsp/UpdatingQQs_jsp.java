package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class UpdatingQQs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>UPDATING QUIZ QUESTIONS</title>\n");
      out.write("         <style>\n");
      out.write("            body {\n");
      out.write("  background-color:snow;\n");
      out.write("  color: snow;\n");
      out.write("  background:url(w1.gif);\n");
      out.write("   background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("input[type=text], input[type=password] ,input[type=date],input[type=email] {\n");
      out.write("  width: 65%;\n");
      out.write("  padding: 15px;\n");
      out.write("  margin: 5px  22px ;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 25px;\n");
      out.write("}\n");
      out.write("input[type=submit],input[type=reset],input[type=file] {\n");
      out.write("   width: 65%;\n");
      out.write("  padding: 15px;\n");
      out.write("  font-weight:bold;\n");
      out.write("   text-shadow: 2px 2px 5px red;\n");
      out.write("  display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    color:darkgreen;\n");
      out.write("  background-color: darkgreen;\n");
      out.write("  color: white;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write("input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]:focus{\n");
      out.write("  background-color: #ddd;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("button,select,date {\n");
      out.write("     width: 65%;\n");
      out.write("  padding: 15px;\n");
      out.write("  font-weight:bold;\n");
      out.write("   text-shadow: 2px 2px 5px red;\n");
      out.write("  display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    color:darkgreen;\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: white;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity:1;\n");
      out.write("}\n");
      out.write("  div {\n");
      out.write("  background-image: linear-gradient(#093028,#237A57);\n");
      out.write("  border-radius: 21px;\n");
      out.write("  padding: 10px; \n");
      out.write("  width: 550px;\n");
      out.write("  height: 950px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("  border-right:1px solid #bbb;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li:last-child {\n");
      out.write("  border-right: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo-img{\n");
      out.write("    position: relative;\n");
      out.write("    margin: 10px 15px 15px 10px;\n");
      out.write("}.logo-img1{\n");
      out.write("    float:right;\n");
      out.write("    position: relative;\n");
      out.write("    margin: 10px 15px 15px 10px;\n");
      out.write("}\n");
      out.write("footer{\n");
      out.write("    background-color:black;\n");
      out.write("   \n");
      out.write("    height:200px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"UpdateMProcess.jsp\" method=\"post\">\n");
      out.write("       ");
  Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "select * from quiz_table";
                PreparedStatement ps1 = con.prepareStatement(query);
                ResultSet rs= ps1.executeQuery(); 
                int id=0;
                 while (rs.next()) {
                    id++; 
                   String qid=rs.getString(1);
                   String b=rs.getString(2);
                   String c=rs.getString(3);
                   String d=rs.getString(4);
                   String e=rs.getString(5);
                   String f=rs.getString(6);
                   String g=rs.getString(7);
            
      out.write("\n");
      out.write("                <center><table border=1>\n");
      out.write("                <tr><th>Question No.</th><th>Question</th></tr>\n");
      out.write("                <tr><th>");
      out.print( qid );
      out.write("</th>\n");
      out.write("                <td>");
      out.print( b );
      out.write("</td></tr>\n");
      out.write("                <tr><th>A:</th><td>");
      out.print( c );
      out.write("</td></tr>\n");
      out.write("                <tr><th>B:</th><td>");
      out.print( d );
      out.write("</td></tr>\n");
      out.write("                <tr><th>C:</th><td>");
      out.print( e );
      out.write("</td></tr>\n");
      out.write("                <tr><th>D:</th><td>");
      out.print( f );
      out.write("</td></tr>\n");
      out.write("                <tr><th>CORRECT ANSWER:</th><td>");
      out.print( g );
      out.write("</td></tr><br><br>\n");
      out.write("                <tr><td><input type=\"button\" name=\"");
      out.print( id);
      out.write("\" value=\"UPDATE\"></td></tr><br><br>\n");
      out.write("                </table></center>\n");
      out.write("              ");
   } 
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"UPDATE YOUR QUESTIONS\">\n");
      out.write("                </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
