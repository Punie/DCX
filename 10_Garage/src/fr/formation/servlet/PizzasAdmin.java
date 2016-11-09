package fr.formation.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings ("serial")
public class PizzasAdmin extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
	    response.setContentType ("text/html");
	    PrintWriter out = response.getWriter ();
	    
	    ServletContext context = this.getServletContext ();
	    context.setAttribute ("Specialite", "Fromage");
	    context.setAttribute ("Date", new Date ());
	    
	    out.println ("La pizza du jour a été définie !");
	    out.println ("<a href=\"pizza\">Pizza</a>");
	}

}
