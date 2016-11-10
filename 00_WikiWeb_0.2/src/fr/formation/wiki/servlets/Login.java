package fr.formation.wiki.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.wiki.DAOs.UserDAO;
import fr.formation.wiki.beans.User;

@SuppressWarnings ("serial")
public class Login extends HttpServlet
{

    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String login = request.getParameter ("login");
        User user = UserDAO.getByUserName (login);
        request.getSession ().setAttribute ("user", user);
        response.sendRedirect ("index.jsp");
        // RequestDispatcher dispatch = this.getServletContext ().getRequestDispatcher ("/");
        // dispatch.forward (request, response);
    }
    
}
