package fr.formation.wiki.beans;

import java.util.ArrayList;
import java.util.List;

public class Article extends Content
{
    
    // Constructors
    public Article ()
    {
        super ();
        title = "";
        comments = new ArrayList<Comment> ();
    }

    
    // Public Methods
    public void addComment (Comment comment)
    {
        comments.add (comment);
    }

    public void removeComment (Comment comment)
    {
        comments.remove (comment);
    }

    
    // Getters & Setters
    public String getTitle () { return title; }
    public void setTitle (String title) { this.title = title; }

    public List<Comment> getComments () { return comments; }
    public void setComments (List<Comment> comments) { this.comments = comments; }

    
    // Properties
    private String title;
    private List<Comment> comments;
}
