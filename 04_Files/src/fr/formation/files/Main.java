package fr.formation.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main
{
	public static void main (String[] args)
	{
		Path p = Paths.get ("../03_Exceptions/src/fr/formation/exceptions/Vehicle.java");
		try
		{
			List<String> lines = Files.readAllLines (p);
			
			// Print Vehicle.java in upper case
			System.out.println ("UPPER CASE\n----------\n");
			lines.forEach (line -> System.out.println (line.toUpperCase ()));
			
			System.out.println ("\n\n");
			
			// Print Vehicle.java from the bottom up
			System.out.println ("BOTTOM UP\n----------\n");
			for (int i = lines.size () - 1 ; i >= 0 ; --i)
				System.out.println (lines.get (i));
			
			System.out.println ("\n\n");
			
			// Print Vehicle.java with each line inverted
			System.out.println ("MIRROR\n----------\n");
			for(String line : lines)
            	System.out.println (new StringBuilder (line).reverse ());
			
			System.out.println ("\n\n");
			
			// Print Vehicle.java in full reverse and upper case
			System.out.println ("REVERSE UPPER CASE\n----------\n");
			for(int i = lines.size () - 1 ; i >= 0 ; --i)
				System.out.println (new StringBuilder (lines.get (i)).reverse ().toString ().toUpperCase ());
		}
		catch (IOException e)
		{
			System.out.println ("Error : " + e.getMessage () + " could not be opened!");
		}
	}
}
