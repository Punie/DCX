package fr.hugo.formation;

public abstract class Shape implements IShape
{
    // CONSTRUCTORS
    public Shape ()
    {
        _color = EColor.BLANC;
    }

    public Shape (EColor color)
    {
        _color = color;
    }

    // Getter and Setter for _color and _name attributes
    public EColor color () { return _color; }
    public void setColor (EColor color) { _color = color; }

    public String name () { return _name; }


    // Abstract methods to be implemented in inherited classes
    public abstract float perimeter ();
    public abstract float area ();
    public abstract void display ();


    // Attributes being shared with inherited classes
    // the protected keyword lets them be accessed directly by those classes
    protected EColor _color;
    protected String _name;
}
