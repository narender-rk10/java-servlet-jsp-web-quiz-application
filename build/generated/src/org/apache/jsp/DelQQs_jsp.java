package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class DelQQs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>DELETE QUESTIONS</title>\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                width: 250px;\n");
      out.write("                height: 100px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                width:700px;\n");
      out.write("                height:10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                 width:700px;\n");
      out.write("                height:10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                 width:700px;\n");
      out.write("                height:10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <center><div><center><table border=1>\n");
      out.write("                <tr><th>TICK WHICH YOU WANT TO DELETE</th><th>Question No.</th><th>Question</th><th>A:</th><th>B:</th><th>C:</th><th>D:</th><th>CORRECT ANSWERS</th></tr>\n");
      out.write("       ");
       Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "select * from quiz_table";
                PreparedStatement ps1 = con.prepareStatement(query);
                ResultSet rs= ps1.executeQuery();
                while (rs.next()) {
                    String qid=rs.getString(1);
                   String b=rs.getString(2);
                    String c=rs.getString(3);
                    String d=rs.getString(4);
                     String e=rs.getString(5);
                   String f=rs.getString(6);
                   String g=rs.getString(7);
            
      out.write("\n");
      out.write("                <tr><th><input type=\"checkbox\" name=\"cb\"></th><td>");
      out.print( qid );
      out.write("</td><td>");
      out.print( b );
      out.write("</td><td>");
      out.print( c );
      out.write("</td><td>");
      out.print( d );
      out.write("</td><td>");
      out.print( e );
      out.write("</td><td>");
      out.print( f );
      out.write("</td><td>");
      out.print( g );
      out.write("</td></tr>\n");
      out.write("            </center></div></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"DELETE YOUR QUESTIONS\">\n");
      }     
      out.write("      \n");
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
