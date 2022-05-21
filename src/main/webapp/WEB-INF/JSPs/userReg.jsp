<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
			<label for="id">ID:</label> <input id="id" type="number" name="id" /> <label
				for="name">Name: </label> <input id="name" type="text" name="name" /> <label
				for="email">Email: </label> <input id="email" type="email"
				name="email" />
		<button type="submit" name="register">Submit</button>
</pre>
	</form>
	<div>${result}</div>
</body>
</html>