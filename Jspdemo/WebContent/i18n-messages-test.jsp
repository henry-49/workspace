<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Internationalization</title>
</head>
<c:set var="theLocale" value="${not empty param.theLocale ? param : pageContext.request.locale}" scope="session" />

<fmt:setLocale value="${theLocale}" />

<!-- Package name and mylabels is the basename -->
<fmt:setBundle basename="com.iluv2code.jsp.tagdemo.i18n.resources.mylabels" />

<body>

	<a href="i18n-messages-test.jsp?theLocale=en_EN">English</a> 
	|
	<a href="i18n-messages-test.jsp?theLocale=es_ES">Spanish</a> 
	|
	<a href="i18n-messages-test.jsp?theLocale=de_DE">German</a>

<hr>
	<fmt:message key="label.greeting" /><br /><br />

	<fmt:message key="label.firstname" /><i>Henry</i><br />

	<fmt:message key="label.lastname" /><i> Smith</i><br /><br />

	<fmt:message key="label.message" /><br />
	
	<hr>
	Selected locale: ${theLocale}
</body>
</html>