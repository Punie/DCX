package fr.formation;

public class WikiApp
{
	public static void main (String[] args)
	{
		Wiki wiki = new Wiki ();
		User toto = new User ();
		User tata = new User ();
		Article article1 = new Article ();
		Article article2 = new Article ();
		Article article3 = new Article ();
		
		toto.setUserName ("Toto");
		tata.setUserName ("Tata");
		tata.setFirstName ("Jane");
		tata.setLastName ("Doe");
		
		article1.setAuthor (toto);
		article1.setTitle ("Article 1");
		article1.setText ("Le premier article de Toto !");
		wiki.addArticle (article1);
		
		article2.setAuthor (toto);
		article2.setTitle ("Article 2");
		article2.setText ("Le second article de Toto !\nOn commence à s'amuser !");
		wiki.addArticle (article2);
		
		article3.setAuthor (tata);
		article3.setTitle ("Article 3");
		article3.setText ("L'article de Tata ! o/");
		wiki.addArticle (article3);
		
		System.out.println (wiki);
	}
}
