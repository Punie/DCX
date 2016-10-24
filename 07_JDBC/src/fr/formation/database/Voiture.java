package fr.formation.database;

public class Voiture
{
	public Voiture (Marque marque, String ref, String couleur, int nbPorte)
	{
		_marque = marque;
		_ref = ref;
		_couleur = couleur;
		_nbPorte = nbPorte;
	}
	
	@Override
	public String toString ()
	{
		return "Voiture :\n - " + _marque + "\n - Ref : " + _ref + "\n - Couleur : " + _couleur + "\n - Nb Portes : " + _nbPorte;
	}
	
	private Marque _marque;
	private String _ref;
	private String _couleur;
	private int _nbPorte;
}
