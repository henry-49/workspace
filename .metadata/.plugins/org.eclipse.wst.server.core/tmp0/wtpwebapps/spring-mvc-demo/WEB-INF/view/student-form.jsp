<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
			First name: <form:input path="firstName" />
			
			<br/><br/>
			
			Last name: <form:input path="lastName" />
			
			<br/><br/>
			
			Country:
			<form:select path="country">
			
				<form:options items="${theCountryOptions}" />
				
			</form:select>
			
			<br/><br/>
			
			Favorite Language:
			 <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
			<br/><br/>
			
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
			<br/><br/>
			
			<input type="submit"  value="Submit" />
	
	</form:form>
</body>
</html>