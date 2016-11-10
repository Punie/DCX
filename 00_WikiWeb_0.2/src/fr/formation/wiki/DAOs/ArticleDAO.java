package fr.formation.wiki.DAOs;

import fr.formation.wiki.beans.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArticleDAO
{
    
    public static void create (Article article)
    {
        PreparedStatement ps = null;
        
        try
        {
            String SQL = "INSERT INTO \"Article\" (title, body, nb_like, author, date_created) VALUES (?, ?, ?, ?, ?)";
            ps = DBFactory.getConnection ().prepareStatement (SQL);
            
            ps.setString (1, article.getTitle ());
            ps.setString (2, article.getText ());
            ps.setInt (4, article.getAuthor ().getId ());
            ps.setDate (5, new java.sql.Date(article.getDateCreated ().getTime ()));
            
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
            String SQL = "SELECT * FROM \"Article\" WHERE id = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);

            ps.setInt (1, id);

            rs = ps.executeQuery ();
            rs.next ();
            
            article = new Article ();
            
            article.setId (id);
            article.setTitle (rs.getString ("title"));
            article.setText (rs.getString ("body"));
            article.setDateCreated (new java.util.Date(rs.getDate ("date_created").getTime ()));
            
            article.setAuthor (UserDAO.getById (rs.getInt ("author")));
            article.setComments (CommentDAO.getByArticleId (id));
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
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Article> articles = null;
        
        try
        {
            String SQL = "SELECT * FROM \"Article\" ORDER BY date_created DESC";
            st = DBFactory.getConnection ().createStatement ();
            rs = st.executeQuery (SQL);
            
            articles = new ArrayList<> ();
            while (rs.next ())
            {
                Article article = new Article ();
                article.setId (rs.getInt ("id"));
                article.setTitle (rs.getString ("title"));
                article.setText (rs.getString ("body"));
                article.setDateCreated (new java.util.Date(rs.getDate ("date_created").getTime ()));
                
                article.setAuthor (UserDAO.getById (rs.getInt ("author")));
                article.setComments (CommentDAO.getByArticleId (rs.getInt ("id")));
                
                articles.add (article);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try { if (rs != null) rs.close (); } catch (SQLException e) {}
            try { if (st != null) rs.close (); } catch (SQLException e) {}
        }
        
        return articles;
    }
    
    public static void update (Article article)
    {
        PreparedStatement ps = null;
        
        try
        {
            String SQL = "UPDATE \"Article\" SET title = ?, body = ?, nb_like = ?, date_created = ? WHERE id = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);
            
            ps.setString (1, article.getTitle ());
            ps.setString (2, article.getText ());
            ps.setDate (4, new java.sql.Date(article.getDateCreated ().getTime ()));
            ps.setInt (5, article.getId ());
            
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
    
    public static void delete (int id)
    {
        PreparedStatement ps = null;
        
        try
        {
            String SQL = "DELETE FROM \"Article\" WHERE id = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);
            
            ps.setInt (1, id);
            
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
    
}
