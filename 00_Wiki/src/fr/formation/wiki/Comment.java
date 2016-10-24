package fr.formation.wiki;

import java.util.Date;

public class Comment extends Content
{
    public Comment ()
    {
        super ();
    }

    public Comment (int id, User author, Date date, String text)
    {
        super (id, author, date, text);
    }

    @Override
    public String toString ()
    {
        return 	"  | Date : " + _date +
                "\n  | Author : " + _author +
                "\n  | Text : " + _text + "\n  +------------------+\n";
    }
}
