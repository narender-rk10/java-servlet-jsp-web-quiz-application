<%-- 
    Document   : ViewQuestions
    Created on : Sep 6, 2019, 7:07:56 PM
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
        <title>View Questions</title>
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
  width: 25%;
  padding: 7px;
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
  div {
  background-image: linear-gradient(#093028,#237A57);
  border-radius: 21px;
  padding: 10px; 
  width: 1050px;
  text-align: center;
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
  padding: 14px 6px;
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
table{
    font-size:12px;
}
table {
  border-collapse: collapse;
    background-image: linear-gradient(#000428,#004e92);
}
</style>
    </head>
    <body>
                    <ul>
  <li><a href="MYOQDescP.html">INSERT QUESTIONS</a></li>
  <li><a href="TestTitleU.html">UPDATE QUESTIONS</a></li>
  <li><a href="TestTitleD.html">DELETE QUESTIONS</a></li>
  <li><a href="TestTitleV.html">VIEW QUESTIONS</a></li>
  <li><a href="ShowUsers.jsp">SHOW USERS</a></li>
  <li><a href="ShowFeedback.jsp">USERS FEEDBACK</a></li>
  <li><a href="LogoutS">LOGOUT</a></li>
                    </ul> <br><br>
        <form>
             <center>
 <img class="logo-img" src="l1.jpeg" width="230" height="145" ALT="align box">
          </center>
            <center><div><br><table border="1">
                        <h4>CHECK YOUR QUESTIONS /REVIEW IT</h4>
                    <tr><th>Question No.</th><th>Question</th><th>A:</th><th>B:</th><th>C:</th><th>D:</th><th>CORRECT ANSWER:</th></tr>
       <%  String a=request.getParameter("t1");
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "select * from "+a+"";
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
            %>
                <tr><th><%= qid %></th>
                <td><%= b %></td>
                <td><%= c %></td>
                <td><%= d %></td>
                <td><%= e %></td>
                <td><%= f %></td>
                <td><%= g %></td>
                <%   } %>
                    </table></div></center>
                </form>
    <footer>
    <center><h1 style="color: white">?? QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>
        <h2 style="color: white">Created By: NARENDER KESWANI</h2>
    </center>
</footer>
    </body>
</html>
