<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All User Details</title>
</head>
<body>
	<ol>
		<c:forEach items="${users}" var="user">
			<li>
				<div>${user.id}</div> 
				<span>
					${user.name} ${user.email}
				</span>
			</li>
		</c:forEach>
	</ol>
</body>
</html>