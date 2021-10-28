<%-- 
    Document   : SignUp
    Created on : Sep 8, 2019, 9:42:10 PM
    Author     : narender
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Process</title>
                <style>
            body {
  background-color:snow;
  color: snow;
   background:url(q9.jpg);
   background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  font-family: Arial, Helvetica, sans-serif;
            }
input[type=text], input[type=password] ,input[type=date],input[type=email] {
  width: 65%;
  padding: 15px;
  margin: 5px  22px ;
  display: inline-block;
  border: none;
  border-radius: 25px;
}
input[type=submit],input[type=reset],input[type=file] {
   width: 65%;
  padding: 15px;
  font-weight:bold;
   text-shadow: 2px 2px 5px red;
  display: inline-block;
    font-size: 16px;
    border-radius: 25px;
    color:darkgreen;
  background-color: darkgreen;
  color: white;
  border: none;
  cursor: pointer;
  opacity: 0.9;
}
input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]:focus{
  background-color: #ddd;
  outline: none;
}
button,select,date {
     width: 65%;
  padding: 15px;
  font-weight:bold;
   text-shadow: 2px 2px 5px red;
  display: inline-block;
    font-size: 16px;
    border-radius: 25px;
    color:darkgreen;
  background-color: #ddd;
  color: white;
  border: none;
  cursor: pointer;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}
  div {
  background-image: linear-gradient(#093028,#237A57);
  border-radius: 21px;
  padding: 10px; 
  width: 550px;
  height: 950px;
  
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  border-right:1px solid #bbb;
}

li:last-child {
  border-right: none;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
li a:hover:not(.active) {
  background-color: #111;
}
.active {
  background-color: #4CAF50;
}
.logo-img{
    position: relative;
    margin: 10px 15px 15px 10px;
}.logo-img1{
    float:right;
    position: relative;
    margin: 10px 15px 15px 10px;
}
footer{
    background-color:black;
}
</style>  
    </head>
    <body>
        <form action='OQZLogin.html' method='post'>
        <center>
        <div>
        <center>
        <%
          String n=request.getParameter("uname");
          String p=request.getParameter("pname");
          String name=request.getParameter("name");
          String phnn=request.getParameter("phnn");
          String en=request.getParameter("en");
          String occ=request.getParameter("occ");
          String uc=request.getParameter("uc");
    
            HttpSession s2=request.getSession(false); 
            
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");   
            response.setHeader("Pragma","no-cache"); 
            response.setHeader ("Expires", "0");

                s2.setAttribute("n",n); 
                s2.setAttribute("name",name);  
                s2.setAttribute("phnn",phnn);
                s2.setAttribute("en",en);  
                s2.setAttribute("occ",occ);
                s2.setAttribute("uc",uc);
                
                String t=(String)s2.getAttribute("n");  
                String u=(String)s2.getAttribute("name");  
                String v=(String)s2.getAttribute("phnn");  
                String w=(String)s2.getAttribute("en");   
                String x=(String)s2.getAttribute("occ");  
                String y=(String)s2.getAttribute("uc");
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
            PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?,?,?,?)");
   
                ps.setString(1,n);
                ps.setString(2,p);
                ps.setString(3,name);
                ps.setString(4,phnn);
                ps.setString(5,en);
                ps.setString(6,occ);
                ps.setString(7,uc);

              
                int i=ps.executeUpdate();
                if(i>0){
                  out.println("<h4>You have sucessfully registered with us!</h4>");
                             out.println("<h4>Your Details are:</h4>");
                             out.println("<h4>USERNAME:"+t+"</h4>");
                             out.println("<h4>NAME:"+u+"</h4>");
                             out.println("<h4>MOBILE NUMBER:"+v+"</h4>");
                             out.println("<h4>EMAIL:"+w+"</h4>");
                             out.println("<h4>OCCUPATION:"+x+"</h4>");
                             out.println("<h4>COUNTRY:"+y+"</h4>"); 
                             out.println("<br>");
                    out.println("<input type=\"submit\" value=\"LOGIN\">");
                }
                else{
                    out.println("ERROR: UNABLE TO ADD YOU IN OUR DATABASE! TRT AGAIN");
                    RequestDispatcher rd=request.getRequestDispatcher("OQZSignUp.html");  
                    rd.include(request, response); 
                }
         %>
              </center> 
            </div>
            </center> 
          </form>
            <footer>
    <center><h1 style="color: white">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>
        <h2 style="color: white">Created By: NARENDER KESWANI</h2>
    </center>
</footer>
    </body>
</html>
