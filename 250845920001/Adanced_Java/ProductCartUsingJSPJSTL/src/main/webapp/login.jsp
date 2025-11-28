<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

<h1>Login Form</h1>

<form action="validateuser" method="post">
	Enter username: <input type="text" name="username" id="username" ></br>
	Enter password: <input type="text" name="password" id="password"></br>
	
	<button type="submit" name="login" id="login">Login</button>
	
</form>
</body>

	<a href="register.jsp">Register</a></br>
	<a href="forgotpassword.jsp">forgot password</a>

</html>