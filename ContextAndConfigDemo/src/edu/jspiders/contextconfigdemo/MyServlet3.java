package edu.jspiders.contextconfigdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet3 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
		
		ServletContext context = getServletContext();
		String mvNm = context.getInitParameter("moviename");
		
		out.print("<h2>Movie name is "+mvNm+"</h2>");
	}
	
}
