package edu.jspiders.weburldemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyOwnServlet extends HttpServlet
{
	public MyOwnServlet(int x) 
	{
		System.out.println("inside args Constructor......");
	}
	
	public MyOwnServlet() 
	{
		System.out.println("inside no- args Constructor......");
	}
	
	@Override
	public void init() throws ServletException 
	{
		System.out.println("inside init method.....");
	}
	/*@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		System.out.println("In service method....");
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
	}*/
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		System.out.println("In service(HSR,HSR) method....");
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
	}*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		System.out.println("inside doGet(HSR,HSR)");
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
	}
	
	@Override
	public void destroy()
	{
		System.out.println("in destroy method.....");
	}
}
