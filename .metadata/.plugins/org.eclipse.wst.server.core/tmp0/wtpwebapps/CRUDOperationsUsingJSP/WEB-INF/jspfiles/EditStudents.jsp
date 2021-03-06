<%@page import="edu.jspiders.studentapp.dto.Student"%>
<%@page import="edu.jspiders.studentapp.dao.StudentDataBaseOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Students</title>
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
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		
	StudentDataBaseOperations op = new StudentDataBaseOperations();
	Student s = op.searchStudent(id);
	%>
		<form action="update" method="POST">
			
			<div class="user-details">
			
				<div class="input-box">
					<span class="details">Student ID</span> <input type="number"
						name="id" placeholder="Enter the Student id" required value="<%= s.getId() %>" readonly="readonly">
				</div>
				
				<div class="input-box">
					<span class="details">Student First Name</span> <input type="text"
						name="fname" placeholder="Enter the Student First Name" required value="<%= s.getFirstName()%>">
				</div>
				
				<div class="input-box">
					<span class="details">Student Last Name</span> <input type="text"
						name="lname" placeholder="Enter the Student last Name" required value="<%= s.getLastName()%>">
				</div>
				<div class="input-box">
					<span class="details">Student Marks</span> <input type="text"
						name="marks" placeholder="Enter the Student Marks" required value="<%= s.getMarks()%>">
				</div>
				<div class="input-box">
					<span class="details">Mail ID</span> <input type="email"
						name="Email" placeholder="Enter the Mail id" required value="<%= s.getEmail()%>">
				</div>
				
				<div class="button">
					<input type="submit" value="Update Student">

				</div>
			</div>
			
			
		</form>
	</div>

</body>
</html>