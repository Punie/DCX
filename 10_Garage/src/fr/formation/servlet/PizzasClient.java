package fr.formation.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings ("serial")
public class PizzasClient extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType ("text/plain");
        PrintWriter out = response.getWriter ();
        
        ServletContext context = this.getServletContext ();
        
        String pizzaSpec = (String) context.getAttribute ("Specialite");
        Date day = (Date) context.getAttribute ("Date");
        DateFormat df = DateFormat.getDateInstance (DateFormat.MEDIUM);
        String today = df.format (day);
        
        out.println ("Aujourd'hui (" + today + "), notre spécialité est : " + pizzaSpec);
    }

}
