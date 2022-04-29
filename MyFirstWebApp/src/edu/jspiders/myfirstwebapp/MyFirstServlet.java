package edu.jspiders.myfirstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		//auto refresh
		resp.setHeader("refresh", "1");
		
		PrintWriter out  = resp.getWriter();
		
		//logic to generate date and time
		Date d = new Date();
		String currentDate = d.toString();
		
		String htmlCode = "<!doctype HTML>"
				+ "<html>"
				+ "<head>"
//				+ "<meta http-equiv='refresh' content='3'>"
				+ "<title>Dyanamic resource</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1 style='color: red; background: yellow;'>This is a <b>Dynamic resource</b> which generates <mark>Dynamic response</mark></h1>"
				+ "<h2>"
				+ currentDate
				+ "</h2>"
				+ "</body>"
				+ "</html>";
		
		out.println(htmlCode);
	}
}
