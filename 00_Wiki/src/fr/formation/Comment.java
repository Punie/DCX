package fr.formation;

import java.util.Date;

public class Comment extends Content
{
	public Comment ()
	{
		super ();
	}
	
	public Comment (User author, Date date, String text)
	{
		super (author, date, text);
	}
}
