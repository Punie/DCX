package fr.formation.database;

public class MainApp
{

	public static void main (String[] args)
	{
//		10	Alpha Romeo    Italie    Bleu    AR0001X6    5    €20 000,00
		VoitureDAO.updateCouleur (10, "Bleu");
		VoitureDAO.updatePrix (10, 20_000);
		VoitureDAO.updateRef (10, "AR0001X6");
		
		Voiture v = VoitureDAO.getById (10);
		System.out.println (v);
	}

}
