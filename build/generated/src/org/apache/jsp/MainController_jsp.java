package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.*;

public final class MainController_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Welcome to QuizYourIQ</title>\n");
      out.write("<style>\n");
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
      out.write("  div {\n");
      out.write("  background-image: linear-gradient(#093028,#237A57);\n");
      out.write("  border-radius: 21px;\n");
      out.write("  padding: 10px; \n");
      out.write("  width: 550px;\n");
      out.write("  height: 500px;\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"MainController.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("              ");
 
                HttpSession s2=request.getSession(false);
                String t=(String)s2.getAttribute("uname1");  
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
              
                Calendar calobj = Calendar.getInstance();
             
                out.println("<center><h2>WELCOME TO QuizYourIQ! ALL THE BEST:</h2><h5>USERNAME:  "+t+"</h5></center>");
              
                response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");            
                response.setHeader("Pragma","no-cache"); 
                response.setHeader ("Expires", "0");

                Object qlist=s2.getAttribute("qlist");
                List qlist1= (ArrayList)qlist;
                ListIterator itr=qlist1.listIterator();
                int current = 1;
             
                     int z=0;
                 
                     if (request.getParameter("hidden") != null) 
                {
                    current = Integer.parseInt(request.getParameter("hidden"));
                }
                
                     if(current==11)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("CheckS");
                    rd.forward(request, response);
                }
                    String a=null; 
                    String b=null;
                    String c=null;
                    String d=null;
                    String e=null; 
                    String f=null;
                    String g=null;
                     int counter = 0;
                for (int i = 0; i < current; i++) 
                {
                    a=(String)itr.next(); 
                    b=(String)itr.next(); 
                    c=(String)itr.next();  
                    d=(String)itr.next(); 
                    e=(String)itr.next(); 
                    f=(String)itr.next(); 
                    g=(String)itr.next();
                    z++;    
                    counter++;
                }
             String[] array=new String[]{c,d,e,f};
              List<String> l1=Arrays.asList(array);
              Collections.shuffle(l1);
         
              String k=l1.get(0);
              String l=l1.get(1);
              String m=l1.get(2);
              String n=l1.get(3); 
              int inc=0;
              if(itr.hasNext()) 
              { 
              
      out.write("\n");
      out.write("                <center><div><h2 <span id=\"timer\"></span></h2>\n");
      out.write("                TEST DATE: ");
out.println(df.format(dateobj));
      out.write("\n");
      out.write("                TEST TIME: ");
out.println(df.format(calobj.getTime()));
      out.write("\n");
      out.write("                <center><table border=1>\n");
      out.write("                <tr><th>Question No.</th><th>Question</th></tr>\n");
      out.write("                <tr><th>");
      out.print(z );
      out.write("<input type=\"hidden\" name=\"qid\" value=\"");
      out.print(b );
      out.write("\"> </th><td>");
      out.print(b);
      out.write("</td></tr>\n");
      out.write("                <tr><th>A:</th><td><input type=\"radio\" name=\"option");
      out.print(inc);
      out.write("\" value=\"");
      out.print(c);
      out.write('"');
      out.write('>');
      out.print(c);
      out.write("</td></tr>\n");
      out.write("                <tr><th>B:</th><td><input type=\"radio\" name=\"option");
      out.print(inc);
      out.write("\" value=\"");
      out.print(d);
      out.write('"');
      out.write('>');
      out.print(d);
      out.write("</td></tr>\n");
      out.write("                <tr><th>C:</th><td><input type=\"radio\" name=\"option");
      out.print(inc);
      out.write("\" value=\"");
      out.print(e);
      out.write('"');
      out.write('>');
      out.print(e);
      out.write("</td></tr>\n");
      out.write("                <tr><th>D:</th><td><input type=\"radio\" name=\"option");
      out.print(inc);
      out.write("\" value=\"");
      out.print(f);
      out.write('"');
      out.write('>');
      out.print(f);
      out.write("</td></tr><br><br>   \n");
      out.write("                <tr><th>Answer:</th><td><input type=\"hidden\" name=\"corans\" value=\"");
      out.print(g);
      out.write("\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                </center>\n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                  <br>\n");
      out.write("                    <input type=\"hidden\" name=\"hidden\" value=\"");
      out.print(current+1 );
      out.write("\"/>\n");
      out.write("                    <input type=\"submit\" value=\"NEXT QUESTION\"><br><br>\n");
      out.write("                    <input type=\"button\" value=\"FINISH EXAM\"  onclick=\"window.location.href = 'CheckS'\">\n");
      out.write("                    <br><br>\n");
      out.write("               </div>\n");
      out.write("               </center>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var count = 60;\n");
      out.write("var redirect = \"CheckS\";\n");
      out.write("function countDown(){\n");
      out.write("    var timer = document.getElementById(\"timer\");\n");
      out.write("    if(count > 0){\n");
      out.write("        count--;\n");
      out.write("        timer.innerHTML = \"Quiz ends in \"+count+\" seconds.\";\n");
      out.write("        setTimeout(\"countDown()\", 1000);\n");
      out.write("    }else{\n");
      out.write("        window.location.href = redirect;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("countDown();\n");
      out.write("</script>\n");
      out.write("<footer>\n");
      out.write("    <center><h1 style=\"color: white\">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>\n");
      out.write("        <h2 style=\"color: white\">Created By: NARENDER KESWANI</h2>\n");
      out.write("    </center>\n");
      out.write("</footer>\n");
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
