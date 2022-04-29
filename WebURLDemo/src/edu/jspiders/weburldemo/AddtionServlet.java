package edu.jspiders.weburldemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddtionServlet  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		
		String number1 = req.getParameter("num1");
		String number2 = req.getParameter("num2");
		
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		
		int res = n1 + n2;
		
		out.print("<h1>Sum of "+n1+" and "+n2+" is "+res+"</h1>");
	}
}
