package fr.formation.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VoitureDAO
{
	public static void updatePrix (int id, int prix)
	{
		PreparedStatement ps = null;
		
		try
		{
			String SQL = "UPDATE Voiture SET prix = ? WHERE id = ?";
			ps = DBFactory.getConnection ().prepareStatement (SQL);
			
			ps.setInt (1, prix);
			ps.setInt (2, id);
			
			ps.execute ();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateCouleur (int id, String couleur)
	{
		PreparedStatement ps = null;
		
		try
		{
			String SQL = "UPDATE Voiture SET couleur = ? WHERE id = ?";
			ps = DBFactory.getConnection ().prepareStatement (SQL);
			
			ps.setString (1, couleur);
			ps.setInt (2, id);
			
			ps.execute ();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateRef (int id, String ref)
	{
		PreparedStatement ps = null;
		
		try
		{
			String SQL = "UPDATE Voiture SET ref = ? WHERE id = ?";
			ps = DBFactory.getConnection ().prepareStatement (SQL);
			
			ps.setString (1, ref);
			ps.setInt (2, id);
			
			ps.execute ();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
