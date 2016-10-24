package fr.formation.wiki;

import java.util.Date;

public abstract class Content
{
    // Constructors
    public Content ()
    {
        _id = 0;
        _author = null;
        _date = new Date ();
        _text = "";
    }

    public Content (int id, User author, Date date, String text)
    {
        _id = id;
        _author = author;
        _date = date;
        _text = text;
    }

    // Getters & Setters
    public int id () { return _id; }
    public void setId (int id) { _id = id; }
    
    public User author () { return _author; }
    public void setAuthor (User author) { _author = author; }

    public Date date () { return _date; }
    public void setDate (Date date) { _date = date; }

    public String text () { return _text; }
    public void setText (String text) { _text = text; }

    // Properties
    protected int _id;
    protected User _author;
    protected Date _date;
    protected String _text;
}
