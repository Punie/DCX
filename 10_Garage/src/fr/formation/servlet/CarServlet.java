package fr.formation.servlet;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

import fr.formation.garage.*;

public class CarServlet extends HttpServlet
{
    private ArrayList<Voiture> voitures = new ArrayList<> ();

    public void init () throws ServletException
    {
        System.out.println ("Init complete !");
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        voitures = VoitureDAO.getAll ();
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />");
        out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" />");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>");
        out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>"); 
        out.println("<title>Garage</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println ("<h1>Web Garage</h1>");
        out.println("</div>");
        out.println("<div class=\"container\">");
        out.println ("<table class=\"table table-bordered table-condensed\">");
        out.println ("<tr>" + "<td><strong>Id</strong></td>" + 
                              "<td><strong>Ref</strong></td>" + 
                              "<td><strong>Marque</strong></td>" + 
                              "<td><strong>Pays</strong></td>" + 
                              "<td><strong>Couleur</strong></td>" + 
                              "<td><strong>Nb Portes</strong></td>" + 
                              "<td><strong>Prix</strong></td>" + "</tr>");
        for (Voiture v : voitures)
        {
            out.println ("<tr>" + "<td>" + v.id () + "</td>" + 
                                  "<td>" + v.ref () + "</td>" + 
                                  "<td>" + v.marque ().libelle () + "</td>" + 
                                  "<td>" + v.marque ().pays () + "</td>" +
                                  "<td>" + v.couleur () + "</td>" + 
                                  "<td>" + v.nbPorte () + "</td>" +
                                  "<td>" + v.prix () + "</td>" + "</tr>");
        }
        out.println ("</table>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    public void destroy()
    {
        DBFactory.closeConnection ();
        System.out.println ("Servlet destroyed !");
    }
}