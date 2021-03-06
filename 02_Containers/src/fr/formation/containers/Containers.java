package fr.formation.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Containers
{
	@SuppressWarnings ("unchecked")
	public static void main (String[] args)
	{
		A a1 = new A ();
		A a2 = new A ();
		A a3 = new A ();
		A a4 = new A ();
		A a5 = new A ();
		B b1 = new B ();
		
		@SuppressWarnings ("rawtypes") 
		List heteroList = new ArrayList ();
		heteroList.add (a1);
		heteroList.add (a2);
		heteroList.add (a3);
		heteroList.add (a4);
		heteroList.add (a5);
		heteroList.add (a1);
		heteroList.add (b1);
		
		List<A> list = new ArrayList<A> ();
		list.add (a1);
		list.add (a2);
		list.add (a3);
		list.add (a1);
		list.add (a2);
		
		Set<A> set = new HashSet<A> ();
		set.add (a1);
		set.add (a2);
		set.add (a3);
		set.add (a1);
		set.add (a2);
		
		Map<String, A> map = new HashMap<String, A> ();
		map.put ("a1", a1);
		map.put ("a2", a2);
		map.put ("a3", a3);
		map.put ("a4", a4);
		map.put ("a5", a5);

		System.out.println ("Taille de la liste 'list' : " + heteroList.size ());
		
		for (int i = 0 ; i < heteroList.size () ; ++i)
		{
			Object obj = heteroList.get(i);
			if (obj instanceof A)
			{
				A a = (A) obj;
				a.m1 ();
			}				
			else
			{
				B b = (B) obj;
				b.m1 ();
			}
		}
		
//		list.forEach (System.out::println);
		
		System.out.println ();
		
		System.out.println ("Taille de la liste 'list' : " + list.size ());
		System.out.println ("Taille de l'ensemble 'set' : " + set.size ());
		
		System.out.println ("Parcours List");
		for (int i = 0 ; i < list.size () ; ++i)
		{
			list.get(i).m1 ();
		}
		
		System.out.println ("Parcours Set");
		Iterator<A> iterator = set.iterator ();
		while (iterator.hasNext ())
		{
			iterator.next().m1 ();
		}
		
		System.out.println ("Parcours Liste + Set");
		
		System.out.println ("    Liste");
		for (A a : list)
			a.m1 ();
		System.out.println ("    Set");
		for (A a : set)
			a.m1 ();
		
		System.out.println ();
		
		System.out.println ("Parcours Map");
		for (String key : map.keySet ())
		{
			System.out.println ("Key : " + key + " | Value : " + map.get (key));
		}
	}
}
