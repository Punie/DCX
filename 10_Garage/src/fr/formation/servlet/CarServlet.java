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
        // voitures.add (new Voiture(1, new Marque ("Mercedes", "Germany"), "ME0001X6", "Noir", 4, 20000));
        voitures = VoitureDAO.getAll ();
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        
        out.println ("<table>");
        out.println ("<tr>" + "<td>Id</td>" + 
                              "<td>Ref</td>" + 
                              "<td>Prix</td>" + 
                              "<td>Couleur</td>" + 
                              "<td>Nb Portes</td>" + 
                              "<td>Marque</td>" + 
                              "<td>Pays</td>" + "</tr>");
        for (Voiture v : voitures)
        {
            out.println ("<tr>" + "<td>" + v.id () + "</td>" + 
                                  "<td>" + v.ref () + "</td>" + 
                                  "<td>" + v.prix () + "</td>" + 
                                  "<td>" + v.couleur () + "</td>" + 
                                  "<td>" + v.nbPorte () + "</td>" + 
                                  "<td>" + v.marque ().libelle () + "</td>" + 
                                  "<td>" + v.marque ().pays () + "</td>" + "</tr>");
        }
        out.println ("</table>");
    }
    
    public void destroy()
    {
        DBFactory.closeConnection ();
    }
}