package fr.formation.wiki;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommentDAO
{
    
    public static ArrayList<Comment> getByArticleId (int articleId)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Comment> comments = null;
        
        try
        {
            String SQL = "SELECT * FROM \"Comment\" WHERE article = ?";
            ps = DBFactory.getConnection ().prepareStatement (SQL);
            
            ps.setInt (1, articleId);
            
            rs = ps.executeQuery ();
            
            comments = new ArrayList<> ();
            while (rs.next ())
            {
                Comment comment = new Comment ();
                comment.setId (rs.getInt ("id"));
                comment.setText (rs.getString ("body"));
                comment.setAuthor (UserDAO.getById (rs.getInt ("author")));
                
                comments.add (comment);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try { if (rs != null) rs.close (); } catch (SQLException e) {}
            try { if (ps != null) rs.close (); } catch (SQLException e) {}
        }
        
        return comments;
    }
    
}
