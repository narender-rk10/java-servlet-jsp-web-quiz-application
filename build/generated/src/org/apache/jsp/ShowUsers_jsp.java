package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ShowUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <table border=\"1\">\n");
      out.write("                <tr><th>ID</th><th>NAME</th><th>USER NAME</th><th>EMAIL</th><th>MOBILE NUMBER</th><th>OCCUPATION</th><th>OCCUPATION</th><th>COUNTRY</th></tr>\n");
      out.write("                \n");
      out.write("        ");
  Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "select name,uname,en,phnn,occ,uc from login";
                PreparedStatement ps1 = con.prepareStatement(query);
                ResultSet rs= ps1.executeQuery(); 
                int id=0;
                 while (rs.next()) {
                    id++; 
                   String un=rs.getString(1);
                   String n=rs.getString(3);
                   String p=rs.getString(4);
                   String e=rs.getString(5);
                   String o=rs.getString(6);
                   String c=rs.getString(7);
                 
            
      out.write("\n");
      out.write("           <tr><td>");
      out.print(id);
      out.write("</td><td>");
      out.print(n);
      out.write("</td><td>");
      out.print(un);
      out.write("</td><td>");
      out.print(p);
      out.write("</td><td>");
      out.print(e);
      out.write("</td><td>");
      out.print(o);
      out.write("</td><td>");
      out.print(c);
      out.write("</td></tr>\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("            </table>\n");
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
