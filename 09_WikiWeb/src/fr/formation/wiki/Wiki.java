package fr.formation.wiki;

import java.util.ArrayList;
import java.util.List;

public class Wiki
{
    // Constructors
    public Wiki ()
    {
        _articles = new ArrayList<Article> ();
    }

    public Wiki (List<Article> articles)
    {
        _articles = articles;
    }

    // Public Methods
    public void addArticle (Article article)
    {
        _articles.add (article);
    }

    public void removeArticle (Article article)
    {
        _articles.remove (article);
    }

    // Getters & Setters
    public List<Article> articles () { return _articles; }
    public void setArticles (List<Article> articles) { _articles = articles; }

    // toString () - for testing purposes
    @Override
    public String toString ()
    {
        String wiki = "";

        for (Article article : _articles)
        {
            wiki += article + "##################################################\n";
        }

        return wiki;
    }

    // Properties
    private List<Article> _articles;
}
