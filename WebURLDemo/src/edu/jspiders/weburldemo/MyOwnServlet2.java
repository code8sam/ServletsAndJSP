package edu.jspiders.weburldemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyOwnServlet2 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
	}

}
