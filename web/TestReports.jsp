<%-- 
    Document   : TestReports
    Created on : Sep 6, 2019, 6:36:22 PM
    Author     : narender
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
input[type=text], input[type=password] {
  width: 65%;
  padding: 15px;
  margin: 5px  22px ;
  display: inline-block;
  border: none;
  border-radius: 25px;
}
input[type=submit],input[type=reset],input[type=button]{
  width: 55%;
  padding: 11px;
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
input[type=text]:focus, input[type=password]:focus ,input[type=file]:focus,input[type=date]:focus,input[type=email]{
  background-color: #ddd;
  outline: none;
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
table {
  border-collapse: collapse;
    background-image: linear-gradient(#000428,#004e92);
}
div {
  background-image: linear-gradient(#093028,#237A57);
  border-radius: 21px;
  padding: 10px; 
  width: 550px;
  text-align: center;
}
</style>
    </head>
    <body>
         <center>
 <img class="logo-img" src="l1.jpeg" width="230" height="145" ALT="align box">
          </center>
    <center><div>
    <center> <h4>CHECK YOUR SCORE</h4> </center>
    <center><table border="1">
                    <tr><th>NAME OF THE STUDENT</th><th>TEST DATE & TIME</th><th>SCORE</th></tr>
        <%  HttpSession s2=request.getSession(false); 
            String a=(String)s2.getAttribute("uname1");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
            String query1 = "select * from reports where uname=?";
            PreparedStatement ps2 = con.prepareStatement(query1);
            ps2.setString(1, a);
            ResultSet rs1= ps2.executeQuery();
            while(rs1.next()){
                String b=rs1.getString(2);
                String c=rs1.getString(3);
                int d=rs1.getInt(4);
        %>
                    <tr><td><%=b%></td><td><%=c%></td><td><%=d%></td></tr>
           <%
                }
            %>
        </table></center><br><br>
            <input type=button onclick=window.location.href='ReviewAns.jsp' value='REVIEW THE CORRECT ANSWERS'>
            <br><br>
            <input type=button onclick=window.location.href='LogoutS' value='LOGOUT'>
        </div></center><br>
                        <footer>
    <center><h1 style="color: white">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>
        <h2 style="color: white">Created By: NARENDER KESWANI</h2>
    </center>
</footer>
    </body>
</html>
