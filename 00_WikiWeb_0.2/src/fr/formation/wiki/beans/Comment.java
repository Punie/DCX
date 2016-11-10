package fr.formation.wiki.beans;

public class Comment extends Content
{
    
    public Comment ()
    {
        super ();
    }

    
    @Override
    public String toString ()
    {
        return 	"  | Date : " + _dateCreated +
                "\n  | Author : " + _author +
                "\n  | Text : " + _text + "\n  +------------------+\n";
    }
    
}
