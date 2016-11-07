package fr.formation.garage;

public class Voiture
{
    public Voiture ()
    {
        _id = 0;
        _marque = null;
        _ref = "XX000000";
        _couleur = "Noir";
        _nbPorte = 0;
        _prix = 0;
    }

    public Voiture (int id, Marque marque, String ref, String couleur, int nbPorte, int prix)
    {
        _id = id;
        _marque = marque;
        _ref = ref;
        _couleur = couleur;
        _nbPorte = nbPorte;
        _prix = prix;
    }


    public int id () { return _id; }
    public void setId (int id) { _id = id; }

    public Marque marque () { return _marque; }
    public void setMarque (Marque marque) { _marque = marque; }
    public void setMarque (String libelle, String pays) { _marque = new Marque (libelle, pays); }

    public String ref () { return _ref; }
    public void setRef (String ref) { _ref = ref; }

    public String couleur () { return _couleur; }
    public void setCouleur (String couleur) { _couleur = couleur; }

    public int nbPorte () { return _nbPorte; }
    public void setNbPorte (int nbPorte) { _nbPorte = nbPorte; }

    public int prix () { return _prix; }
    public void setPrix (int prix) { _prix = prix; }

    @Override
    public String toString ()
    {
        return "Voiture :\n - Id : " + _id + "\n - " + _marque + "\n - Ref : " + _ref + "\n - Couleur : " + _couleur + "\n - Nb Portes : " + _nbPorte + "\n - Prix : " + _prix;
    }

    private int _id;
    private Marque _marque;
    private String _ref;
    private String _couleur;
    private int _nbPorte;
    private int _prix;
}
