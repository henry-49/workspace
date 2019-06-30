<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Register here</h2>
	<form:form id="registerForm" action="registrationProcess" method="post"
		modelAttribute="user">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="username" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>