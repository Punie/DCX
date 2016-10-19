package fr.formation.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main
{
	public static void printFileShenanigans (Path p) throws IOException
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
	
	public static void testFiles () throws IOException
	{
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
		
		System.out.println ("p1 isHidden? " + Files.isHidden (p1));
		System.out.println ("p2 isHidden? " + Files.isHidden (p2));
		System.out.println ("p4 isHidden? " + Files.isHidden (p4));
		System.out.println ();
		
		System.out.println ("p1 isSameFile as p3? " + Files.isSameFile (p1, p3));
		System.out.println ("p1 isSameFile as p4? " + Files.isSameFile (p1, p4));
		System.out.println ();
		
		System.out.println ("p1 isWritable? " + Files.isWritable (p1));
		System.out.println ("p2 isWritable? " + Files.isWritable (p2));
		System.out.println ("p4 isWritable? " + Files.isWritable (p4));
	}
	
	public static void copyFile (Path p1, Path p2) throws IOException
	{
		Files.copy (p1, p2);
	}
	
	public static void deleteFile (Path p) throws IOException
	{
		boolean exists = Files.deleteIfExists (p);
		System.out.println (exists);
	}
	
	public static void ls (Path p) throws IOException
	{
		System.out.println (" . " + p.getFileName ());
		tree (p, " |____ ");
	}
	
	private static void tree (Path p, String pre) throws IOException
	{
		DirectoryStream<Path> ds = Files.newDirectoryStream (p);
		for (Path path : ds)
		{
			System.out.println (pre + path.getFileName ());
			if (Files.isDirectory (path))
			{
				tree (path, "   " + pre);
			}
		}
	}
	
	public static void createFile (Path p) throws IOException
	{
		Files.createFile (p);
	}
	
	@SuppressWarnings("unused")
	public static void main (String[] args)
	{
		Path pFile = Paths.get ("../03_Exceptions/src/fr/formation/exceptions/Vehicle.java");
		Path pCopy = Paths.get ("../../../Desktop/Vehicle.txt");
		Path pDir = Paths.get ("../00_Wiki");

		try
		{
//			printFileShenanigans(pFile);
//			testFiles();
//			copyFile (pFile, pCopy);
			ls (pDir);
//			deleteFile (Paths.get ("toto.txt"));
//			createFile (Paths.get ("toto.txt"));
//			deleteFile (Paths.get ("toto.txt"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
