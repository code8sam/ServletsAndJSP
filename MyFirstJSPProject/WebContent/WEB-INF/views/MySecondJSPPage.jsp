<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Second JSP Page</title>
</head>
<body>
	<h1>This is the response of My Second JSP Page</h1>
	<%	
		LocalDateTime currentDate = LocalDateTime.now();
	%>
	
	<h2>Current Date and time is <%= currentDate %></h2>
</body>
</html>