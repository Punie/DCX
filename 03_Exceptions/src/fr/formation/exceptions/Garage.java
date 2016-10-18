package fr.formation.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Garage
{
	public static void main (String[] args)
	{
		List<Vehicle> vehicles = new ArrayList<> ();
		List<Vehicle> vehicles2 = new ArrayList<> ();
		
		Vehicle v1 = new Car ();
		Vehicle v2 = new Motorcycle ();
		Vehicle v3 = new Vehicle ();
		Car c1 = new Car ();
		Car c2 = new Car ();
		Motorcycle m1 = new Motorcycle ();
		Truck t1 = new Truck ();
		
		vehicles.add (v1);
		vehicles.add (v2);
		vehicles.add (v3);
		vehicles.add (c1);
		vehicles.add (m1);
		vehicles.add (t1);
		
		for (Vehicle v : vehicles)
			v.display ();
		
		System.out.println("####################");
		
		vehicles2.add (c1);
		vehicles2.add (c2);
		vehicles2.add (m1);
		
		for (Vehicle v : vehicles2)
		{
			if (v instanceof Car)
			{
				Car c = (Car) v;
				c.display ();
			}
			else
			{
				Motorcycle m = (Motorcycle) v;
				m.display ();
			}
			// Sans ces conditions on aurait une exception
		}
		
		Vehicle v = new Vehicle ();
		
		try
		{
			v.setBrand ("opel");
		}
		catch (CamelCaseException e)
		{
			System.out.println ("Error : " + e);
		}
		finally
		{
			System.out.println ("Done !");
		}
	}
}
