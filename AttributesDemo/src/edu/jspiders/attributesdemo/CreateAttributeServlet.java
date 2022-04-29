package edu.jspiders.attributesdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class CreateAttributeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Student s = new Student(10, "Rama", "Raju", 89.63, "ramaraju@gmail.com", "rama@raju");
		
		ServletContext context = getServletContext();
		context.setAttribute("student", s);
		
		out.print("<h1>Attribute Setted!!!</h1>");
	}
}
