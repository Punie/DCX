package fr.formation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings ("serial")
public class SessionServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		response.setContentType ("text/plain");
		PrintWriter out = response.getWriter ();
		HttpSession session = request.getSession ();
		
		Integer count = (Integer) session.getAttribute ("count");
		
		if (count == null)
		    count = 1;
		else
		    count++;
		
		session.setAttribute ("count", count);
		
		out.println ("Page visitée " + count + " fois.");
	}

}
