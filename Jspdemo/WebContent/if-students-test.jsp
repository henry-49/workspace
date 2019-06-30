<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.iluv2.jsp.tagdemo.Students" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Jsp Page</title>
</head>
<%
	// just create some sample data ... normally provided by MVC
	List<Students> data = new ArrayList();
	
	data.add(new Students("Jason", "Smith", true));
	data.add(new Students("Tobias", "Tim", true));
	data.add(new Students("Hans", "Witzmann", false));
	
	pageContext.setAttribute("myStudents", data);
%>
<body>
	<table border="1">
		<thead>
			<tr>
				
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gold Customer</th>
			</tr>
		</thead>
		<tbody>
	<c:forEach var="tempStudents" items="${myStudents}">
		<tr>
				
				<td>${tempStudents.firstName}</td>
				<td>${tempStudents.lastName}</td>
				<td>
					<c:if test="${tempStudents.goldCustomer}">
						Special Discount
					</c:if>
						<c:if test="${not tempStudents.goldCustomer}">
							No Discount
					</c:if>
				</td>
				
			</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>