<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstName = request.getParameter("fnm");
		String lastName = request.getParameter("lnm");
		
		String fullName = firstName+" "+lastName;
	%>
	
	<h1>Full Name is <%= fullName %></h1>
</body>
</html>