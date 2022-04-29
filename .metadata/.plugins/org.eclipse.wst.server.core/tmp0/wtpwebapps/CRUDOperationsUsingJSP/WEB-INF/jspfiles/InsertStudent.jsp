<%@page import="edu.jspiders.studentapp.dao.StudentDataBaseOperations"%>
<%@page import="edu.jspiders.studentapp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	String password = request.getParameter("Password");

	Student s = new Student();
	s.setId(id);
	s.setFirstName(fname);
	s.setLastName(lname);
	s.setMarks(marks);
	s.setEmail(email);
	s.setPassword(password);
	
	StudentDataBaseOperations op = new StudentDataBaseOperations();
	
	boolean isInserted = op.registerStudent(s);
	if(isInserted)
	{
	%>
		<h1 style="background: green;">Student Data Inserted</h1>
		<jsp:include page="/dispalyAll"></jsp:include>
	<%
	}
	else
	{
	%>
		<h1 style="background: red;">Student Data Not Inserted</h1>
		<jsp:include page="/insertStudentsForm"></jsp:include>
	<%
	}
	%>
	
</body>
</html>