package fr.formation.exceptions;

public class Car extends Vehicle
{
	public Car ()
	{
		
	}
	
	public void display ()
	{
		System.out.println ("Je suis une voiture !");
	}
	
	public int nbPortes () { return _nbPortes; }
	public void setNbPortes (int nbPortes) { _nbPortes = nbPortes; }
	
	private int _nbPortes;
}
