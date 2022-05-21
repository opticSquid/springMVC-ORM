<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"
	import="com.sb.spring.springmvcorm.user.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered Successfully</title>
</head>
<body>
	<h1>Registration done</h1>
	<h2>User Details</h2>
	<ul>
		<%
		User user = (User) request.getAttribute("user");
		out.print("<li> ID: " + user.getId() + "</li>" + "<li> Name: " + user.getName() + "</li>" + "<li> Email: "
				+ user.getEmail() + "</li>");
		%>
	</ul>
</body>
</html>