<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC For Students </title>
</head>
<body>
<h2>Student Table Demo</h2>
<hr/>
<br/>
	<table border="1">
		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
		
	<c:forEach var="temStudent" items="${student_list}">
		<tr>
			<td>${temStudent.firstName}</td>
			<td>${temStudent.lastName}</td>
			<td>${temStudent.email}</td>
		</tr>
	</c:forEach>
		
	</tbody>
	</table>
</body>
</html>