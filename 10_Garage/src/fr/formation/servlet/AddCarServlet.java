package fr.formation.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.garage.Marque;
import fr.formation.garage.Voiture;
import fr.formation.garage.VoitureDAO;

public class AddCarServlet extends HttpServlet
{
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    String ref = request.getParameter ("ref");
	    String couleur = request.getParameter ("color");
	    Marque marque = new Marque (request.getParameter ("brand"), request.getParameter ("country"));
	    int nbPorte = Integer.parseInt(request.getParameter ("doors"));
	    int prix = Integer.parseInt (request.getParameter ("price"));
	    
	    Voiture v = new Voiture (marque, ref, couleur, nbPorte, prix);
	    
	    VoitureDAO.add (v);
	    
	    response.sendRedirect ("Cars");
	}

}
