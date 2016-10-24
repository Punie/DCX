package fr.formation.database;

import java.util.ArrayList;

public class MainApp
{

	public static void main (String[] args)
	{
//		10	Alpha Romeo    Italie    Bleu    AR0001X6    5    €20 000,00
		VoitureDAO.updateCouleur (10, "Bleu");
		VoitureDAO.updatePrix (10, 20_000);
		VoitureDAO.updateRef (10, "AR0001X6");
		
		ArrayList<Integer> ids = VoitureDAO.getIds ();
		
		for (Integer i : ids)
		{
			Voiture v = VoitureDAO.getById (i);
			System.out.println (v);
		}		
	}

}
