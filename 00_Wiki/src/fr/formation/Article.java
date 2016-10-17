package fr.formation;

import java.util.Date;
import java.util.List;

public class Article extends Content
{
	// Constructors
	public Article ()
	{
		super ();
	}
	
	public Article (User author, Date date, String text, String title, List<Comment> comments)
	{
		super (author, date, text);
		_title = title;
		_comments = comments;
	}
	
	// Getters & Setters
	public String title () { return _title; }
	public void setTitle (String title) { _title = title; }
	
	public List<Comment> comments () { return _comments; }
	public void setComments (List<Comment> comments) { _comments = comments; }
	
	// Properties
	private String _title;
	private List<Comment> _comments;
}
