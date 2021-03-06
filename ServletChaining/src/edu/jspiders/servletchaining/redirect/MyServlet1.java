package edu.jspiders.servletchaining.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class MyServlet1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
		
		//dynamic internal resource
//		String url = "http://localhost:8008/ServletChaining/s2";
		
		//static internal resource
		//String url = "http://localhost:8008/ServletChaining/index.html";
		
		String url = "https://github.com";
		resp.sendRedirect(url);
	}
}
