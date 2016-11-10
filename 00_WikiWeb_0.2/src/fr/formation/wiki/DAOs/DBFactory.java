package fr.formation.wiki.DAOs;

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
            connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/" + db, usr, pwd);
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
    
    public static void closeConnection ()
    {
        try { if (connection != null) connection.close (); } catch (SQLException e) {}
    }

    private static Connection connection = null;
    private static final String db = "wiki";
    private static final String usr = "admin";
    private static final String pwd = "admin";
}
