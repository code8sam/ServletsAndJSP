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
		<form action="insertStudent" method="POST">
			
			<div class="user-details">
			
				<div class="input-box">
					<span class="details">Student ID</span> <input type="number"
						name="id" placeholder="Enter the Student id" required>
				</div>
				
				<div class="input-box">
					<span class="details">Student First Name</span> <input type="text"
						name="fname" placeholder="Enter the Student First Name" required>
				</div>
				
				<div class="input-box">
					<span class="details">Student Last Name</span> <input type="text"
						name="lname" placeholder="Enter the Student last Name" required>
				</div>
				<div class="input-box">
					<span class="details">Student Marks</span> <input type="text"
						name="marks" placeholder="Enter the Student Marks" required>
				</div>
				<div class="input-box">
					<span class="details">Mail ID</span> <input type="email"
						name="Email" placeholder="Enter the Mail id" required>
				</div>
				<div class="input-box">
					<span class="details">Password</span> <input type="password"
						name="Password" placeholder="Enter the Password" required>
				</div>
				<div class="button">
					<input type="submit" value="Insert Student">

				</div>
			</div>
			
			
		</form>
	</div>

</body>
</html>