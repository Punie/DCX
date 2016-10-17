package fr.formation;

import java.util.Date;

public abstract class Content
{
	// Constructors
	public Content ()
	{
		_author = null;
		_date = new Date ();
		_text = "";
	}
	
	public Content (User author, Date date, String text)
	{
		_author = author;
		_date = date;
		_text = text;
	}
	
	// Getters & Setters
	public User author () { return _author; }
	public void setAuthor (User author) { _author = author; }
	
	public Date date () { return _date; }
	public void setDate (Date date) { _date = date; }
	
	public String text () { return _text; }
	public void setText (String text) { _text = text; }
	
	// Properties
	protected User _author;
	protected Date _date;
	protected String _text;
}
