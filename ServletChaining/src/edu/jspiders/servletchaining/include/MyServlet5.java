package edu.jspiders.servletchaining.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s5")
public class MyServlet5 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/s2");
		dispatcher.include(req, resp);
		
		out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");
		
		req.getRequestDispatcher("/index.html").include(req, resp);
		
	}
}
