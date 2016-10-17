package fr.hugo.formation;

public class Rectangle extends Shape implements IShape
{
    // CONSTRUCTORS
    // super () calls the constructor of the parent class (Shape)
    public Rectangle (float length, float width)
    {
        super ();
        ++count;
        _length = length;
        _width = width;
        _name = "Rectangle_" + count;
    }

    public Rectangle (float length, float width, EColor color)
    {
        super (color);
        _length = length;
        _width = width;
        _name = "Rectangle_" + count;
    }


    // Getters & Setters for the _length and _width attributes
    public float length () { return _length; }
    public void setLength (float length) { _length = length; }

    public float width () {	return _width;	}
    public void setWidth (float width) { _width = width; }


    // Implementation of the interface methods
    public float perimeter () {	return 2f * (_length + _width);	}
    public float area () { return _length * _width;	}

    public void display ()
    {
        System.out.println (_name);
        System.out.println ("Longueur : " + _length);
        System.out.println ("Largeur : " + _width);
        System.out.println ("Couleur : " + _color);
        System.out.println ("Périmètre : " + perimeter ());
        System.out.println ("Aire : " + area ());
        System.out.println ();
    }


    // Class Field
    private static int count = 0;

    // Instance Fields
    private float _length;
    private float _width;
}
