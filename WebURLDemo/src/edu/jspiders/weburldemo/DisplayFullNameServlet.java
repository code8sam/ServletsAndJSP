package edu.jspiders.weburldemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayFullNameServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
		
		//logic to collect data from query string
		String fnm = req.getParameter("fname");
		String lnm = req.getParameter("lname");
		
		out.print("<h3>First name is "+fnm+"</h3>");
		out.print("<h3>Last Name is "+lnm+"</h3>");
		
		out.print("<h2>Full Name is "+fnm+" "+lnm+"</h2>");
	}
}
