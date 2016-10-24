package fr.formation.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp
{

	public static void main (String[] args)
	{
		try
		{
			Statement st = DBFactory.getConnection ().createStatement ();
			ResultSet rs = st.executeQuery ("SELECT * FROM Voiture INNER JOIN Marque ON Voiture.id_marque = Marque.id;");
			
			int i = 0;
			while (rs.next ())
			{
				String marque = rs.getString ("libelle");
				String pays = rs.getString ("pays");
				String couleur = rs.getString ("couleur");
				String ref = rs.getString ("ref");
				String nbPorte = rs.getString ("nb_porte");
				String prix = rs.getString ("prix");
				System.out.println (++i + " >  " + marque + "    " + pays + "    " + couleur + "    " + ref + "    " + nbPorte + "    " + prix);
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
