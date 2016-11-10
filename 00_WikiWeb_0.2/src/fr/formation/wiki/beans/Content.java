package fr.formation.wiki.beans;

import java.util.Date;

public abstract class Content
{
    // Constructors
    public Content ()
    {
        id = 0;
        author = null;
        dateCreated = null;
        text = "";
    }

    
    // Getters & Setters
    public int getId () { return id; }
    public void setId (int id) { this.id = id; }
    
    public User getAuthor () { return author; }
    public void setAuthor (User author) { this.author = author; }

    public Date getDateCreated () { return dateCreated; }
    public void setDateCreated (Date date) { this.dateCreated = date; }

    public String getText () { return text; }
    public void setText (String text) { this.text = text; }

    
    // Properties
    protected int id;
    protected User author;
    protected Date dateCreated;
    protected String text;
}
