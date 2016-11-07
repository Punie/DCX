package fr.formation.wiki;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO
{
    
    public static User getById (int id)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        
        try
        {
            String SQL = "SELECT * FROM \"User\" WHERE id = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);

            ps.setInt (1, id);

            rs = ps.executeQuery ();
            rs.next ();
            
            user = new User ();
            
            user.setId (id);
            user.setUserName (rs.getString ("user_name"));
            user.setFirstName (rs.getString ("first_name"));
            user.setLastName (rs.getString ("last_name"));
        }
        catch (SQLException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try { if (rs != null) rs.close (); } catch (SQLException e) {} 
            try { if (ps != null) ps.close (); } catch (SQLException e) {}
        }

        return user;
    }
    
}
