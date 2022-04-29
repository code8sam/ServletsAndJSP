package edu.jspiders.cookiesdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeCookies")
public class RemoveCookiesServlet  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie[] allCookies = req.getCookies();
		if(allCookies != null)
		{
			for (Cookie cookie : allCookies) 
			{
				String name = cookie.getName();
				if(name.equals("cookie2"))
				{
					cookie.setMaxAge(0);
					resp.addCookie(cookie);
					out.print("<h1>"+name+" is removed!!!</h1>");
				}
			}
		}
		else
		{
			out.print("<h1>Cookies not present!!!</h1>");
		}
	}
}
