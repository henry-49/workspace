<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Comfirmation Title</title>
</head>
<body>
	The student is confirmed : ${param.firstName} ${param.lastName}
	
	<br/><br/>
	The student's country : ${param.country}
	
	<br/><br/>
	<!-- display list of "favoriteLanguage" -->
	The student's favorite programming language: 
	<ul>
		<%
			String[] langs = request.getParameterValues("favoriteLanguage");
		if(langs !=null){
		for(String temLang : langs){
			out.println("<li>"+ temLang + "</li>");
			}
		}else{
			out.println("Please Select a Language!");
		}		
		%>
	</ul>
	
</body>
</html>