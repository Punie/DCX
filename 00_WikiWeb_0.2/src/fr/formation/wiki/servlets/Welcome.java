package fr.formation.wiki.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.wiki.beans.User;

@SuppressWarnings ("serial")
public class Welcome extends HttpServlet
{

    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        User user = (User) request.getAttribute ("user");
        String page;
        
        if (user == null)
            page = "/login.jsp";
        else
            page = "/";
        
        RequestDispatcher dispatch = this.getServletContext ().getRequestDispatcher (page);
        dispatch.forward (request, response);
	}
    
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doGet (request, response);
    }

}
