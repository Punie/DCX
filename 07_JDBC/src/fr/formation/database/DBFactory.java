package fr.formation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFactory
{
	public static Connection getConnection () 
	{
		if (connection != null)
			return connection;
		
		try
		{
			Class.forName ("org.postgresql.Driver");
			connection = DriverManager.getConnection ("jdbc:postgresql://localhost:8080/" + db, usr, pwd);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace ();
		}
		finally
		{
			// ...
		}
		
		return connection;
	}
	
	private static Connection connection = null;
	private static final String db = "garage";
	private static final String usr = "hugo";
	private static final String pwd = "azerty12345";	
}