package fr.formation.wiki;

public class WikiApp
{
    
    public static void main (String[] args)
    {
        Wiki wiki = new Wiki ();
        wiki.setArticles (ArticleDAO.getAll ());
        
        System.out.println (wiki);
    }
    
}
