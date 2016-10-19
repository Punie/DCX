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
		Path p = Paths.get ("../03Exceptions/src/fr/formation/exceptions/Vehicle.java");
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
			System.out.println ("Error : " + e.getMessage () + " could not be opened!\n");
		}
		
		Path p1 = Paths.get ("src/fr/formation/files/Main.java");
		Path p2 = Paths.get ("src/");
		Path p3 = Paths.get ("src/fr/formation/files/Main.java");
		Path p4 = Paths.get ("../.gitignore");
		
		System.out.println ("p1 isDirectory? " + Files.isDirectory (p1));
		System.out.println ("p2 isDirectory? " + Files.isDirectory (p2));
		System.out.println ("p4 isDirectory? " + Files.isDirectory (p4));
		System.out.println ();
		
		System.out.println ("p1 isExecutable? " + Files.isExecutable (p1));
		System.out.println ("p2 isExecutable? " + Files.isExecutable (p2));
		System.out.println ("p4 isExecutable? " + Files.isExecutable (p4));
		System.out.println ();
				
		System.out.println ("p1 isReadable? " + Files.isReadable (p1));
		System.out.println ("p2 isReadable? " + Files.isReadable (p2));
		System.out.println ("p4 isReadable? " + Files.isReadable (p4));
		System.out.println ();
		
		System.out.println ("p1 isRegularFile? " + Files.isRegularFile (p1));
		System.out.println ("p2 isRegularFile? " + Files.isRegularFile (p2));
		System.out.println ("p4 isRegularFile? " + Files.isRegularFile (p4));
		System.out.println ();
		
		try
		{
			System.out.println ("p1 isHidden? " + Files.isHidden (p1));
			System.out.println ("p2 isHidden? " + Files.isHidden (p2));
			System.out.println ("p4 isHidden? " + Files.isHidden (p4));
			System.out.println ();
		}		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			System.out.println ("p1 isSameFile as p3? " + Files.isSameFile (p1, p3));
			System.out.println ("p1 isSameFile as p4? " + Files.isSameFile (p1, p4));
			System.out.println ();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println ("p1 isWritable? " + Files.isWritable (p1));
		System.out.println ("p2 isWritable? " + Files.isWritable (p2));
		System.out.println ("p4 isWritable? " + Files.isWritable (p4));
	}
}
