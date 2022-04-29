<%@page import="edu.jspiders.studentapp.dto.Student"%>
<%@page import="edu.jspiders.studentapp.dao.StudentDataBaseOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Students</title>
<link rel="stylesheet" href="./resources/css/mystyle2.css">
</head>
<body>
	
	<%
	String sid = request.getParameter("id");
	int id = Integer.parseInt(sid);
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String mark = request.getParameter("marks");
	double marks = Double.parseDouble(mark);
	String email = request.getParameter("Email");

	Student s = new Student();
	s.setId(id);
	s.setFirstName(fname);
	s.setLastName(lname);
	s.setMarks(marks);
	s.setEmail(email);
	
	StudentDataBaseOperations op = new StudentDataBaseOperations();
	op.updateStudent(s);
	%>
	
	<jsp:include page="/dispalyAll"></jsp:include>	

</body>
</html>