package fr.formation.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Garage
{
	public static void main (String[] args)
	{
		List<Vehicle> vehicles = new ArrayList<> ();
		Vehicle v1 = new Car ();
		Vehicle v2 = new Motorcycle ();
		Vehicle v3 = new Vehicle ();
		Car c1 = new Car ();
		Motorcycle m1 = new Motorcycle ();
		
		vehicles.add (v1);
		vehicles.add (v2);
		vehicles.add (v3);
		vehicles.add (c1);
		vehicles.add (m1);
		
		for (Vehicle v : vehicles)
			v.display ();
	}
}
