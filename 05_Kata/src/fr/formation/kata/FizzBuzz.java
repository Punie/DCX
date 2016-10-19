package fr.formation.kata;

public class FizzBuzz
{
	public static void print (int n)
	{
		System.out.println (n % 15 == 0 ? "FizzBuzz" : n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : n);
	}
	
	public static void print2 (int n)
	{
		if (n % 15 == 0)
			System.out.println ("FizzBuzz");
		else if (n % 5 == 0)
			System.out.println ("Buzz");
		else if (n % 3 == 0)
			System.out.println ("Fizz");
		else
			System.out.println (n);
	}
	
	
	public static void main (String[] args)
	{
		for (int i = 1 ; i <= 100 ; ++i)
			print (i);
	}
}