package edu.jspiders.mysecondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySecondServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
		
		String html = "<table border='2' align='center'>"
				+ "<tr>"
				+ "<th>ID</th>"
				+ "<th>First Name</th>"
				+ "<th>Last Name</th>"
				+ "<th>Marks</th>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>001</td>"
				+ "<td>Rakshith</td>"
				+ "<td>Kumar</td>"
				+ "<td>56.56</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>002</td>"
				+ "<td>Rama</td>"
				+ "<td>Krishna</td>"
				+ "<td>95.63</td>"
				+ "</tr>"
				+ "</table>";
		
		out.print(html);
	}
}
