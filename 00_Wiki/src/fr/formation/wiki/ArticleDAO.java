package fr.formation.wiki;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArticleDAO
{
    public static void create (Article article)
    {
        PreparedStatement ps = null;
        
        try
        {
            String SQL = "INSERT INTO Article (title, body, nb_like) VALUES (?, ?, ?)";
            ps = DBFactory.getConnection ().prepareStatement (SQL);
            
            ps.setString (1, article.title ());
            ps.setString (2, article.text ());
            ps.setInt (3, article.nbLike ());
            
            ps.execute ();
        }
        catch (SQLException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try { if (ps != null) ps.close (); } catch (SQLException e) {}
        }
    }
    
    public static Article getById (int id)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Article article = null;

        try
        {
            String SQL = "SELECT * FROM Article WHERE Voiture.id = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);

            ps.setInt (1, id);

            rs = ps.executeQuery ();
            rs.next ();
            
            article = new Article ();
            
            article.setId (rs.getInt ("id"));
            article.setTitle (rs.getString ("title"));
            article.setText (rs.getString ("body"));
            article.setNbLike (rs.getInt ("nb_like"));
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

        return article;
    }
    
    public static ArrayList<Article> getAll ()
    {
        return null;
    }
    
    
    
}
