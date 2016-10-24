package fr.formation.database;

import java.util.ArrayList;

public class MainApp
{

    public static void main (String[] args)
    {
        ArrayList<Voiture> voitures = VoitureDAO.getAll ();

        for (Voiture v : voitures)
        {
            System.out.println (v);
            System.out.println ();
        }
        
        DBFactory.closeConnection ();
    }

}
