package edu.jspiders.sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String user = req.getParameter("user");
		String password = req.getParameter("pswd");
		
		if(user.equals("admin") && password.equals("admin@123"))
		{
			//create the session
			HttpSession session = req.getSession();
			session.setMaxInactiveInterval(10000);
			
			out.print("<a href='./s1'>Servlet1</a>");
			out.print("<a href='./s2'>Servlet2</a>");
			out.print("<a href='./logout'>logout</a>");
		}
		else
		{
			out.print("<h1>Invalid Credentails</h1>");
		}
	}
}
