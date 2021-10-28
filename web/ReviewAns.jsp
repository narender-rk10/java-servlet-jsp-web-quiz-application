<%-- 
    Document   : ReviewAns
    Created on : Sep 7, 2019, 8:26:57 AM
    Author     : narender
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.ArrayList"%>
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
table{
    font-size:12px;
}
table {
  border-collapse: collapse;
    background-image: linear-gradient(#000428,#004e92);
}
.panel, .flip {
  padding: 5px;
  text-align: center;
  background-color: #e5eecc;
  border: solid 1px #c3c3c3;
   background-image: linear-gradient(#093028,#237A57);
  border-radius: 21px;

}
.panel {
  padding: 10px;
  display: none;
  width:25%;
  height:150px;
  text-align: left;
   background-image: linear-gradient(#093028,#237A57);
  border-radius: 21px;
 
}
</style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script>
$(document).ready(function(){
  $(".flip").click(function(){
    $(".panel").slideToggle(1000);
  });
});
</script>
    </head>
    <body>
        <form>
             <center>
 <img class="logo-img" src="l1.jpeg" width="230" height="145" ALT="align box">
          </center>
            <center>
                <h4>CHECK YOUR QUESTIONS /REVIEW IT</h4> </center>
            <%    
                     Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" ); 
                    PreparedStatement ps = con.prepareStatement("select distinct * from java order by rand() limit 20"); 
                    ResultSet rs = ps.executeQuery();
                    int num=0;
                while(rs.next())
                {
                   String a= rs.getString(1);
                   String b= rs.getString(2);
                   String c= rs.getString(3);
                   String d= rs.getString(4);
                   String e= rs.getString(5);
                   String f= rs.getString(6);
                   String g= rs.getString(7);
                   num++;
            %>
            <center><div class="flip"><input type="hidden" name="qid" value="<%=a%>"><%=num%>) <%=b%></div><br>
                <div class="panel">A:<%=c%><br>B:<%=d%><br>C:<%=e%><br>D:<%=f%><br>CORRECT ANSWER:<%=g%></div></center><br>
      <% } %>
                <footer>
    <center><h1 style="color: white">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>
        <h2 style="color: white">Created By: NARENDER KESWANI</h2>
    </center>
</footer>
</body>
</html>
