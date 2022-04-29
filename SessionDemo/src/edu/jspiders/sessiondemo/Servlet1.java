package edu.jspiders.sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		//validate the session
		HttpSession session = req.getSession(false);
		if(session != null)
		{
			out.print("<h1>This is the response of "+this.getClass().getSimpleName()+"</h1>");

			out.print("<a href='./s1'>Servlet1</a>");
			out.print("<a href='./s2'>Servlet2</a>");
			out.print("<a href='./logout'>logout</a>");
		}
		else
		{
			out.print("<h1>Invalid Access!!!</h1>");
		}
	}
}
