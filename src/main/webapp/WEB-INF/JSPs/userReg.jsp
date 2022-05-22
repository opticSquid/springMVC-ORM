<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>User Registration</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
			<label for="id">ID:</label> <input id="id" type="number" name="id" /><span
				id="errMsg"></span> <label for="name">Name: </label> <input
				id="name" type="text" name="name" /> <label for="email">Email: </label> <input
				id="email" type="email" name="email" />
		<button type="submit" name="register">Submit</button>
</pre>
	</form>
	<div>${result}</div>
	<script type="text/javascript">
		$(document).ready(function() {
			console.log("hello");
			$("#id").change(function() {
				$.ajax({
					url : "validateEmail",
					data : {
						id : $("#id").val()
					},
					success : function(responseText) {
						$("#errMsg").text(responseText);
						if (responseText != "") {
							$("#id").focus();
						}
					}
				});
			});
		});
	</script>
</body>
</html>