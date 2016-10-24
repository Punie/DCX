package fr.formation.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp
{

	public static void main (String[] args)
	{
//		10	Alpha Romeo    Italie    Bleu    AR0001X6    5    €20 000,00
		VoitureDAO.updateCouleur (10, "Gris");
		VoitureDAO.updatePrix (10, 57_014);
		VoitureDAO.updateRef (10, "AR0005M7");
		
		try
		{
			Statement st = DBFactory.getConnection ().createStatement ();
			ResultSet rs = st.executeQuery ("SELECT * FROM Voiture INNER JOIN Marque ON Voiture.id_marque = Marque.id;");
			
			while (rs.next ())
			{
				String id = rs.getString ("id");
				String marque = rs.getString ("libelle");
				String pays = rs.getString ("pays");
				String couleur = rs.getString ("couleur");
				String ref = rs.getString ("ref");
				String nbPorte = rs.getString ("nb_porte");
				String prix = rs.getString ("prix");
				System.out.println (id + " >  " + marque + "    " + pays + "    " + couleur + "    " + ref + "    " + nbPorte + "    " + prix);
			}
			
			rs.close ();
		}
		catch (SQLException se)
		{
			se.printStackTrace ();
		}
		catch (Exception e)
		{
			e.printStackTrace ();
		}
		finally
		{
			// ...
		}
	}

}
