<%@page import="edu.jspiders.studentapp.dto.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.jspiders.studentapp.dao.StudentDataBaseOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>
<link rel="stylesheet" href="./resources/css/mystyle2.css">
</head>
<body>
	<header>
		<h1 class="title">Student App</h1>
	</header>
	
	<nav>
		<a href="">Search Students</a>
		<a href="./insertStudentsForm">Insert Students</a>
		<a href="./dispalyAll">Display All Students</a>
		<a href="">Display Based on Ranks</a>
	</nav>
	<div class="container">
		<table border="1" align="center">
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Marks</th>
				<th>Email ID</th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
	
		<%
			StudentDataBaseOperations op = new StudentDataBaseOperations();
			ArrayList<Student> allStudents =  op.getAllStudents();
			for(int i = 0; i < allStudents.size(); i++)
			{
				Student s = allStudents.get(i);
		%>
			<tr>
				<td><%= s.getId() %></td>
				<td><%= s.getFirstName() %></td>
				<td><%= s.getLastName() %></td>
				<td><%= s.getMarks() %></td>
				<td><%= s.getEmail() %></td>
				<td><a href="./edit?id=<%= s.getId() %>">Edit</a></td>
				<td><a href="./delete?id=<%= s.getId() %>">Delete</a></td>
			</tr>
		<%
			}
		%>
		</table>
	</div>

</body>
</html>