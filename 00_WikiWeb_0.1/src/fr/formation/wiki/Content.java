package fr.formation.wiki;

import java.util.Date;

public abstract class Content
{
    // Constructors
    public Content ()
    {
        _author = null;
        _dateCreated = new Date ();
        _text = "";
    }

    
    // Getters & Setters
    public int id () { return _id; }
    public void setId (int id) { _id = id; }
    
    public User author () { return _author; }
    public void setAuthor (User author) { _author = author; }

    public Date dateCreated () { return _dateCreated; }
    public void setDateCreated (Date date) { _dateCreated = date; }

    public String text () { return _text; }
    public void setText (String text) { _text = text; }

    
    // Properties
    protected int _id;
    protected User _author;
    protected Date _dateCreated;
    protected String _text;
}
