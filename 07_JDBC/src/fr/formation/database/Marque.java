package fr.formation.database;

public class Marque
{
    public Marque ()
    {
        _libelle = "";
        _pays = "";
    }

    public Marque (String libelle, String pays)
    {
        _libelle = libelle;
        _pays = pays;
    }

    public String libelle () { return _libelle; }
    public void setLibelle (String libelle) { _libelle = libelle; }

    public String pays () { return _pays; }
    public void setPays (String pays) { _libelle = pays; }

    @Override
    public String toString ()
    {
        return "Marque : " + _libelle + " (" + _pays + ")";
    }

    private String _libelle;
    private String _pays;
}
