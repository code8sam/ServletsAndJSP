<%@page import="edu.jspiders.studentapp.dao.StudentDataBaseOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Students</title>
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	
	StudentDataBaseOperations op = new StudentDataBaseOperations();
	op.deleteStudent(id);
	
	%>
	<jsp:include page="/dispalyAll"></jsp:include>
	
</body>
</html>