package fr.formation.exceptions;

public class Vehicle
{
	public Vehicle ()
	{
		
	}
	
	public void display ()
	{
		System.out.println ("Je suis un véhicule");
	}
	
	public String color () { return _color; }
	public void setColor (String color) { _color = color; }
	
	protected String _color;
}
