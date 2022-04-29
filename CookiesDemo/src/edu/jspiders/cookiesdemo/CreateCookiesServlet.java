package edu.jspiders.cookiesdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookies")
public class CreateCookiesServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie c1 = new Cookie("cookie1", "100");
		c1.setMaxAge(60*60*24*7);
		resp.addCookie(c1);
		
		Cookie c2 = new Cookie("cookie2", "200");
		c2.setMaxAge(60*60*24);
		resp.addCookie(c2);
		
		Cookie c3 = new Cookie("cookie3", "300");
		resp.addCookie(c3);
		
		Cookie c4 = new Cookie("cookie4", "400");
		resp.addCookie(c4);
		
		Cookie c5 = new Cookie("cookie5", "500");
		resp.addCookie(c5);
		
		out.print("<h1>Cookies Created!!!</h1>");
	}
}
