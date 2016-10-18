package fr.formation.exceptions;

public class Truck extends Vehicle
{
	public Truck ()
	{
		
	}
	
	public int weight () { return _weight; }
	public void setWeight (int weight) { _weight = weight; }
	
	private int _weight;
}
