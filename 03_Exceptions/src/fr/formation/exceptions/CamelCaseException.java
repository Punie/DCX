package fr.formation.exceptions;

public class CamelCaseException extends Exception
{
	public void error ()
	{
		System.out.println ("Il faut renseigner une marque en CamelCase !");
	}
}
