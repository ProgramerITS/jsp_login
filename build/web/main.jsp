<%@page import="java.sql.*"%>
<html>
<head>
<title>check_main</title>
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


String user = request.getParameter("usr");
String password = request.getParameter("pwd");
String Data = "select * from login WHERE email = '"+user+"' AND password = '"+password+"'";
 out.print(Data);

rs = statement.executeQuery(Data);
if(rs.next()){
         response.sendRedirect("./newjsp.jsp");
         session.setAttribute( "status","login");
}else{
         response.sendRedirect("./");
   }
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
    out.println("Can?t connect to database.");
}






%>

</body>
</html>