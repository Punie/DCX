package fr.formation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.postgresql.*;

public class MainApp
{

	public static void main (String[] args)
	{
		Connection connection = null;
		
		try
		{
			Class.forName ("org.postgresql.Driver");
			connection = DriverManager.getConnection ("localhost:8080", "hugo", "pommeQ69");
			Statement st = connection.createStatement ();
			ResultSet rs = st.executeQuery ("SELECT * FROM table");
			
			while (rs.next ())
			{
				String nom = rs.getString ("Nom");
				String ref = rs.getString ("ref");
				// ...
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
