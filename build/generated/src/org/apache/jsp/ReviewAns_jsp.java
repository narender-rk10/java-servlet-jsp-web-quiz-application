package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ReviewAns_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("  body {\n");
      out.write("  background-color:snow;\n");
      out.write("  color: snow;\n");
      out.write("   background:url(q9.jpg);\n");
      out.write("   background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("   }\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 65%;\n");
      out.write("  padding: 15px;\n");
      out.write("  margin: 5px  22px ;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 25px;\n");
      out.write("}\n");
      out.write("input[type=submit],input[type=reset],input[type=button]{\n");
      out.write("  width: 25%;\n");
      out.write("  padding: 7px;\n");
      out.write("  font-weight:bold;\n");
      out.write("  text-shadow: 2px 2px 5px red;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 25px;\n");
      out.write("  color:darkgreen;\n");
      out.write("  background-color: darkgreen;\n");
      out.write("  color: white;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write("input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]{\n");
      out.write("  background-color: #ddd;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("  border-right:1px solid #bbb;\n");
      out.write("}\n");
      out.write("li:last-child {\n");
      out.write("  border-right: none;\n");
      out.write("}\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #111;\n");
      out.write("}\n");
      out.write(".active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("}\n");
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
      out.write("}\n");
      out.write("table{\n");
      out.write("    font-size:12px;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("    background-image: linear-gradient(#000428,#004e92);\n");
      out.write("}\n");
      out.write(".panel, .flip {\n");
      out.write("  padding: 5px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: #e5eecc;\n");
      out.write("  border: solid 1px #c3c3c3;\n");
      out.write("   background-image: linear-gradient(#093028,#237A57);\n");
      out.write("  border-radius: 21px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".panel {\n");
      out.write("  padding: 10px;\n");
      out.write("  display: none;\n");
      out.write("  width:25%;\n");
      out.write("  height:150px;\n");
      out.write("  text-align: left;\n");
      out.write("   background-image: linear-gradient(#093028,#237A57);\n");
      out.write("  border-radius: 21px;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\".flip\").click(function(){\n");
      out.write("    $(\".panel\").slideToggle(1000);\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("             <center>\n");
      out.write(" <img class=\"logo-img\" src=\"l1.jpeg\" width=\"230\" height=\"145\" ALT=\"align box\">\n");
      out.write("          </center>\n");
      out.write("            <center>\n");
      out.write("                <h4>CHECK YOUR QUESTIONS /REVIEW IT</h4> </center>\n");
      out.write("            ");
    
                    HttpSession s2=request.getSession(false);
                    Object qlist=s2.getAttribute("qlist");
                    List qlist1= (ArrayList)qlist;
                    ListIterator itr=qlist1.listIterator();
                    int num=0;
    for (int i = 0; i < 21; i++)
    {
    itr.next();
    itr.next();
    itr.next();
    itr.next();
    itr.next();
    itr.next();
    itr.next();
    num++;
    }
                 
            
      out.write("\n");
      out.write("            <center><div class=\"flip\"><input type=\"hidden\" name=\"qid\" value=\"");
      out.print(itr.next());
      out.write('"');
      out.write('>');
      out.print(num);
      out.print(itr.next());
      out.write("</div><br>\n");
      out.write("                <div class=\"panel\">A:");
      out.print(itr.next());
      out.write("<br>B:");
      out.print(itr.next());
      out.write("<br>C:");
      out.print(itr.next());
      out.write("<br>D:");
      out.print(itr.next());
      out.write("<br>CORRECT ANSWER:");
      out.print(itr.next());
      out.write("</div></center><br>\n");
      out.write("                <footer>\n");
      out.write("    <center><h1 style=\"color: white\">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>\n");
      out.write("        <h2 style=\"color: white\">Created By: NARENDER KESWANI</h2>\n");
      out.write("    </center>\n");
      out.write("</footer>\n");
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
