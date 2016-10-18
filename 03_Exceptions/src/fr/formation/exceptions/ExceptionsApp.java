package fr.formation.exceptions;

public class ExceptionsApp
{
	public static void main (String[] args)
	{
		Voiture v = new Voiture ();
		Vehicule vh = v;
		Moto m = (Moto) vh;
	}
}
