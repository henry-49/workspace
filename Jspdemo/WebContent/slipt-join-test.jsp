<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Slipt and Join Demo</title>
</head>
<body>

	<c:set var="data" value="London, Duisburg, Oberhausen, Califonia"/>
	
	<h3>Slipt Demo</h3>
	
	<!--  slipt will the data value to an Array  -->
	<c:set var="citiesArray" value="${fn:split(data, ',')}" />
	
	<c:forEach var="tempCities" items="${citiesArray}">
		${tempCities} <br/>
	</c:forEach>
	
	<h3>Join Demo</h3>
	<c:set var="joinFun" value="${fn:join(citiesArray, '*')}" />
	
	Result of joining: ${joinFun}
</body>
</html>