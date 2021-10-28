
<%-- 
    Document   : DelController
    Created on : Sep 5, 2019, 2:02:23 PM
    Author     : narender
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DELETE QUIZ QUESTIONS</title>
    </head>
    <body>
       <%       
                String cb[] =request.getParameterValues("cb"); 
                 HttpSession s2=request.getSession(false);
                String a=(String)s2.getAttribute("table");
            if(cb !=null) { 
            for(int i=0;i<cb.length;i++) { 
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/JCAOQS","root","Narend-10" );
                String query = "delete from "+a+" where q_id='"+cb[i]+"'";
                PreparedStatement ps1 = con.prepareStatement(query);
                int j= ps1.executeUpdate();
               
                
                    if(j>0){
                      %>
                         <jsp:include page="DelQQs.jsp" />        
                 <%   } 
                
               }
            }
       %>
   <footer>
    <center><h1 style="color: white">© QuizYourIQ, Inc. ALL RIGHTS RESERVED 2019</h1>
        <h2 style="color: white">Created By: NARENDER KESWANI</h2>
    </center>
</footer>
    </body>
</html>
