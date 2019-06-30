<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Step 1: Create HTML Form -->
	<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem">
		
		<input type="submit" value="Submit">
	</form>
	<br/><br/>
	<!-- Step 2: Add new item to "To Do" List -->
	<%
		// get the To Do item from session
		List <String> items = (List<String>) session.getAttribute("myToDoList");
		
		// if the To Do items doesn't exist, then create a new one
		if(items == null){
			items = new ArrayList<String>();
			session.setAttribute("myToDoList", items);
		}
		
		// see if there is form data to add
		String theItem= request.getParameter("theItem");
		if(theItem !=null && (!theItem.trim().equals(""))){
			items.add(theItem);
		}
	%>
	<!--  Step 3: Display all "To Do" item from session -->
	<hr>
	<b>ToDo List Items: </b> <br/>
	<ol>
		<%
			for(String tempList: items){
				
				out.println("<li>"+ tempList +"</li>");
			}
		%>
	</ol>
</body>
</html>