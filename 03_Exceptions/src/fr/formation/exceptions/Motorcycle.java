package fr.formation.exceptions;

public class Motorcycle extends Vehicle
{
	public Motorcycle ()
	{
		
	}
	
	public void display ()
	{
		System.out.println ("Je suis une moto !");
	}
	
	public String brand () { return _brand; }
	public void setBrand (String brand) { _brand = brand; }
	
	private String _brand;
}
