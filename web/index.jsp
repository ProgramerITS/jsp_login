
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>login</title>
	
</head>
<body>
	<form action="main.jsp" method="post" >
		 <input type="text" name="usr" placeholder="อีเมล์"><br>
		 <input type="text" name="pwd" placeholder="รหัสผ่าน"><br><br>
		 <input type="submit" value="เข้าสู่ระบบ">
                 <input type="button" onclick="window.location.href='reg.html'" value="สมัคร!!">
	</form>
</body>
</html>
