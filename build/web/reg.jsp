<%@page import="java.sql.*"%>
<%@ page contentType="text/html;charset=UTF-8"%>

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

String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("password");
String cpassword = request.getParameter("confirmpassword");
String tel = request.getParameter("tel");

String Data = "INSERT INTO login (name,email,password,tel) VALUES ('"+name+"','"+email+"','"+password+"','"+tel+"')";



if(password.equals(cpassword)){
if(statement.execute(Data)){
    out.println("เพิ่มไม่สำเร็จ");
}else{
    out.println("เพิ่มสำเร็จ");
        
   }
}else{
        out.println("เพิ่มไม่สำเร็จ");
   }
response.setHeader("Refresh", "5;url=index.jsp");
statement.close();
connection.close();
} catch (Exception ex) {
out.println("Can?t connect to database.");
}






%>

</body>
</html>