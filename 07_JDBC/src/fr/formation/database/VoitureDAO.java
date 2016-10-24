package fr.formation.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VoitureDAO
{
    public static Voiture getById (int id)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try
        {
            String SQL = "SELECT libelle, pays, ref, couleur, nb_porte, prix::money::numeric "
                        + "FROM Voiture INNER JOIN Marque ON Voiture.id_marque = Marque.id "
                        + "WHERE Voiture.id = ?";

            ps = DBFactory.getConnection ().prepareStatement (SQL);

            ps.setInt (1, id);
            rs = ps.executeQuery ();

            rs.next ();

            return new Voiture (id,
                                new Marque (rs.getString ("libelle"), rs.getString ("pays")),
                                rs.getString ("ref"),
                                rs.getString ("couleur"),
                                rs.getInt ("nb_porte"),
                                rs.getInt ("prix"));
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

        return null;
    }

    public static ArrayList<Voiture> getAll ()
    {
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Voiture> voitures = new ArrayList<Voiture> ();

        try
        {
            st = DBFactory.getConnection ().createStatement ();
            rs = st.executeQuery ("SELECT Voiture.id, libelle, pays, ref, couleur, nb_porte, prix::money::numeric "
                                + "FROM Voiture INNER JOIN Marque ON Voiture.id_marque = Marque.id "
                                + "ORDER BY Voiture.id");

            while (rs.next ())
            {
                Voiture voiture = new Voiture (rs.getInt ("id"),
                                               new Marque (rs.getString ("libelle"), rs.getString ("pays")),
                                               rs.getString ("ref"),
                                               rs.getString ("couleur"),
                                               rs.getInt ("nb_porte"),
                                               rs.getInt ("prix"));
                voitures.add (voiture);
            }

            return voitures;
        }
        catch (SQLException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try { if (rs != null) rs.close (); } catch (SQLException e) {} 
            try { if (st != null) st.close (); } catch (SQLException e) {}
        }

        return null;
    }

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
        finally
        {
            try { if (ps != null) ps.close (); } catch (SQLException e) {}
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
        finally
        {
            try { if (ps != null) ps.close (); } catch (SQLException e) {}
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
        finally
        {
            try { if (ps != null) ps.close (); } catch (SQLException e) {}
        }
    }
}
