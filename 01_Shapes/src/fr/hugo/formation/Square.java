package fr.hugo.formation;

public class Square extends Rectangle implements IShape
{
    // CONSTRUCTORS
    // super () calls the constructor of the parent class (Rectangle)
    public Square (float side)
    {
        super (side, side);
        ++count;
        _name = "Carre_" + count;
    }

    public Square (float side, EColor color)
    {
        super (side, side, color);
        ++count;
        _name = "Carre_" + count;
    }


    // Getter and Setter for side (induced field)
    public float side () { return length(); }
    public void setSide (float side)
    {
        setLength (side);
        setWidth (side);
    }


    // Implementation of the interface methods
    public float perimeter () {	return 4f * side (); }
    public float area () { return side () * side (); }

    public void display ()
    {
        System.out.println (_name);
        System.out.println ("Côté : " + side ());
        System.out.println ("Couleur : " + _color);
        System.out.println ("Périmètre : " + perimeter ());
        System.out.println ("Aire : " + area ());
        System.out.println ();
    }


    // Class Field
    private static int count = 0;
}
