<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%
  
if(request.getParameter("btn1")!= null){
   session.removeAttribute("status");
}
   if(session.getAttribute("status")!="login"){
            response.sendRedirect("./");
   }
 %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content=”text/html; charset=UTF-8″>
<title>JSP Page</title>
</head>
<body>
<%
try {
String Host = "jdbc:mysql://localhost:3306/ebookshop";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(Host, "root", "");
statement = connection.createStatement();
String Data = "select * from books";
rs = statement.executeQuery(Data);
%>
<table border="1" width="100%">
<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
<th>qty</th>
</tr>
<% while (rs.next()) { %>
<TR>
<TD><%=rs.getString("id")%></TD>
<TD><%=rs.getString("title")%></TD>
<TD><%=rs.getString("author")%></TD>
<TD><%=rs.getString("price")%></TD>
<TD><%=rs.getString("qty")%></TD>
</TR>
<% } %></table>
<%
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
out.println("Can’t connect to database.");
}


%>
<br>
<form method="post" action="">   
    <input type="submit" id="btn1" name="btn1" value="LOGOUT"/>
   
</form>  
<!--<h1><a href="?status=logout">LOGOUT</a></h1></body>-->
</html>