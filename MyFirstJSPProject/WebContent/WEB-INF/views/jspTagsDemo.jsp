<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>
	<h1>JSP Tags</h1>
	
	<ol>
		<li>Declaration Tags</li>
		<li>Expression Tags</li>
		<li>Scriptlet Tags</li>
		<li>Action Tags</li>
		<li>Directive Tags</li>
	</ol>
	
	<!-- declaration tags <%! %>  -->
	
	<%!
		String name = "Ramu";
	
		public static String m1()
		{
			System.out.println("In M1 method!!");
			return "Hello";
		}
	%>
	
	<h1>Name is <%= name %></h1>
	<h2><%= m1() %></h2>
	
	<%
		System.out.println("Scriptlet Tag");
	int x = 10;
	%>
	
	<%
		for(int  i = 1; i <= 10; i++)
		{
			System.out.println(i);
	%>
		<h3><%= i %></h3>
	<%
		}
	%>
	
	<%-- <jsp:forward page="./second"/> --%>
	
	<jsp:include page="./second"/>
	
</body>
</html>