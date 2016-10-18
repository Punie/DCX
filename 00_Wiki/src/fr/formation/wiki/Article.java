package fr.formation.wiki;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article extends Content
{
	// Constructors
	public Article ()
	{
		super ();
		_nbLike = 0;
		_title = "";
		_comments = new ArrayList<Comment> ();
	}

	public Article (int nbLike, String title, List<Comment> comments)
	{
		super ();
		_nbLike = nbLike;
		_title = title;
		_comments = comments;
	}

	public Article (User author, Date date, String text)
	{
		super (author, date, text);
		_nbLike = 0;
		_title = "";
		_comments = new ArrayList<Comment> ();
	}
	
	public Article (User author, Date date, String text, int nbLike, String title, List<Comment> comments)
	{
		super (author, date, text);
		_nbLike = nbLike;
		_title = title;
		_comments = comments;
	}
	
	// Public Methods
	public void addComment (Comment comment)
	{
		_comments.add (comment);
	}
	
	public void removeComment (Comment comment)
	{
		_comments.remove (comment);
	}
	
	// Getters & Setters
	public int nbLike () { return _nbLike; }
	public void setNbLike (int nbLike) { _nbLike = nbLike; }
	
	public String title () { return _title; }
	public void setTitle (String title) { _title = title; }
	
	public List<Comment> comments () { return _comments; }
	public void setComments (List<Comment> comments) { _comments = comments; }
	
	// toString () - for testing purposes
	@Override
	public String toString ()
	{
		String article =	"Date : " + _date + 
							"\nTitle : " + _title + 
							"\nText : " + _text + 
							"\nAuthor : " + _author +
							"\nLikes : " + _nbLike +
							"\nComments : " + _comments.size () + "\n";
		
		if (_comments.size () > 0)
			article += "+----------+\n| Comments |\n+----------+\n";
		for (Comment comment : _comments)
			article += comment;
		
		return article;		
	}
	
	// Properties
	private int _nbLike;
	private String _title;
	private List<Comment> _comments;
}
