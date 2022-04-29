<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Life Cycle Demo</title>
</head>
<body>
	<h1>Demo on Life Cycle</h1>
	
	<ol>
		<li>Translation and Instantiation Phase</li>
		<li>Initialization Phase</li>
		<li>Service Phase</li>
		<li>Destruction Phase</li>
	</ol>
	
	<%!
		public void jspInit()
		{
			System.out.println("In jspInit method!!!!");
		}
		
		public void jspDestroy()
		{
			System.out.println("In jspDestroy method!!!!");
		}
	%>
	
	<%
		System.out.println("in _jspService method!!!");
	%>
	
</body>
</html>