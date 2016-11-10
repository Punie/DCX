package fr.formation.wiki.beans;

import java.util.ArrayList;
import java.util.List;

public class Wiki
{
    // Constructors
    public Wiki ()
    {
        articles = new ArrayList<Article> ();
    }


    // Public Methods
    public void addArticle (Article article)
    {
        articles.add (article);
    }

    public void removeArticle (Article article)
    {
        articles.remove (article);
    }

    // Getters & Setters
    public List<Article> getArticles () { return articles; }
    public void setArticles (List<Article> articles) { this.articles = articles; }

    // Properties
    private List<Article> articles;
}
