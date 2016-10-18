package fr.formation.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
	public static void main (String[] args)
	{
		Path p = Paths.get ("src/fr/formation/files/data.txt");
		try
		{
			BufferedReader buffer = Files.newBufferedReader (p);
			System.out.println (buffer.readLine ());
			System.out.println (buffer.readLine ());
		}
		catch (IOException e)
		{
			System.out.println ("Error : " + e.getMessage ());
		}
	}
}
