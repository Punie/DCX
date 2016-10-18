package fr.formation.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
	public static void main (String[] args)
	{
		Path p = Paths.get ("../03_Exceptions/src/fr/formation/exceptions/Vehicle.java");
		try
		{
			Files.readAllLines (p).forEach (line -> System.out.println (line.toUpperCase ()));
		}
		catch (IOException e)
		{
			System.out.println ("Error : " + e.getMessage ());
		}
	}
}
