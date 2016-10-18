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
	
	public String brand () { return _brand; }
	
	public void setBrand (String brand) throws CamelCaseException
	{
		if (Character.isUpperCase(brand.charAt(0)))
			_brand = brand;
		else
			throw new CamelCaseException ();
	}
	
	protected String _color;
	protected String _brand;
}
