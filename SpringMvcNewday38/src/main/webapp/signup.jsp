<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Form</title>
</head>
<body>
<h2 align='center'>Jobiak SignUp Form</h2>
<form action='signup' method='post'>
Enter first name:<input type="text"name="fname"><br/>
Enter mobile:<input type="text" name="mobile"><br/>
Enter email:<input type="text" name="email"><br/>
Click to send data:<input type="submit"value="SignUp"><br/>
Click to reset data:<input type="reset" value="clean"><br/>
<form>
</body>
</html>