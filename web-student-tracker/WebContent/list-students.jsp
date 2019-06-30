<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Tracker App</title>

<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>University Of Dusseldorf</h2>
		</div>
	</div>
	
	<div id="container">
		
		<div id="content">
			
			<!-- put a new button: Add student -->
			<input type="button" value="Add Student"
				onclick="window.location.href='add-student-form.jsp'; return false;"
					class="add-student-button"
			 />
			 
			<table border="1">
			
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tempStudent" items="${STUDENT_LIST}">
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="StudentControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="studentId" value="${tempStudent.id}"></c:param>
					</c:url>
					
					<!-- set up a link to delete student -->
					<c:url var="deleteLink" value="StudentControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="studentId" value="${tempStudent.id}"></c:param>
					</c:url>
					<tr>
						<td>${tempStudent.getFirstName()}</td>
						<td>${tempStudent.getLastName()}</td>
						<td>${tempStudent.getEmail()}</td>
						<td><a href="${tempLink}">Update</a>
								|
							<a href="${deleteLink}"
								onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a>	
						</td>
						
						</tr>
					</c:forEach>
					
					
					
					
				</tbody>			
			</table>
			
		</div>
	</div>
	
</body>
</html>