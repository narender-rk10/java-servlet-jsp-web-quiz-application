package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Examination_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Welcome to QuizYourIQ</title>\n");
      out.write("                  <style>\n");
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
      out.write("input[type=submit],input[type=reset],input[type=button],select{\n");
      out.write("  width: 55%;\n");
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
      out.write("div {\n");
      out.write("  background-image: linear-gradient(#093028,#237A57);\n");
      out.write("  border-radius: 21px;\n");
      out.write("  padding: 10px; \n");
      out.write("  width: 550px;\n");
      out.write("  height: 550px;\n");
      out.write("  text-align: center;\n");
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
      out.write("    width:350px;\n");
      out.write("    height:350px;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("    background-image: linear-gradient(#000428,#004e92);\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function fun1()\n");
      out.write("{\n");
      out.write("document.Examination.action=\"CheckS\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"TableController\" method=\"post\" target=\"_self\">\n");
 HttpSession s2=request.getSession(false);
    String fname=(String)s2.getAttribute("uname1");
      out.write("\n");
      out.write("    <center><div>\n");
      out.write("<table border=\"1\">\n");
      out.write("Good Luck ");
      out.print(fname );
      out.write("!!!\n");

int current = 0;
int num=1;
Object qlist=s2.getAttribute("qlist");
List qlist1= (ArrayList)qlist;
ListIterator itr=qlist1.listIterator();
String qid=request.getParameter("qid");
if (request.getParameter("hidden") != null)
{
current = Integer.parseInt(request.getParameter("hidden"));
}
for (int i = 0; i < current; i++)
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
if(itr.hasNext())
{

      out.write("\n");
      out.write("<tr><td><input type=\"hidden\" name=\"qid\" value=\"");
      out.print(itr.next() );
      out.write("\"><input type=\"text\" name=\"qid\" Disabled Readonly id=\"qid\" value=\"");
      out.print(num );
      out.write("\"/></td>\n");
      out.write("    <td><textarea name=\"question\" cols=\"50\" rows=\"5\" Disabled Readonly id=\"question\">");
      out.print(num );
      out.write('.');
      out.print(itr.next() );
      out.write("</textarea></td>\n");
      out.write("    <tr><td>A)</td><td><input type=\"radio\" name=\"option\" value=\"A\">");
      out.print(itr.next());
      out.write("</td></tr>\n");
      out.write("    <tr><td>B)</td><td><input type=\"radio\" name=\"option\" value=\"B\">");
      out.print(itr.next());
      out.write("</td></tr>\n");
      out.write("    <tr><td>C)</td><td><input type=\"radio\" name=\"option\" value=\"C\">");
      out.print(itr.next() );
      out.write("</td></tr>\n");
      out.write("    <tr><td>D)</td><td><input type=\"radio\" name=\"option\" value=\"D\">");
      out.print(itr.next());
      out.write("</td></tr>\n");
      out.write("<input type=\"hidden\" name=\"corans\" value=\"");
      out.print(itr.next() );
      out.write("\">\n");
      out.write("    </table><br><br>\n");
      out.write("<input type=\"hidden\" name=\"hidden\" value=\"");
      out.print(current+1 );
      out.write("\">\n");
      out.write("  <input type=\"submit\" VALUE=\"next\">\n");
      out.write("<input type=\"button\" VALUE=\"Submit Exam\" onclick=\"location.href='CheckS'\">  \n");

}

      out.write("\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("</div></center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
