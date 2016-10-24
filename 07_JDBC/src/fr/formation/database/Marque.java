package fr.formation.database;

public class Marque
{
	public Marque (String libelle, String pays)
	{
		_libelle = libelle;
		_pays = pays;
	}
	
	@Override
	public String toString ()
	{
		return "Marque : " + _libelle + " (" + _pays + ")";
	}
	
	private String _libelle;
	private String _pays;
}
