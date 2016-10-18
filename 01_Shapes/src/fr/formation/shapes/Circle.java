package fr.formation.shapes;

public class Circle extends Shape implements IShape
{
    // CONSTRUCTORS
    // super () calls the constructor of the parent class (Shape)
    public Circle (float radius)
    {
        super ();
        ++count;
        _radius = radius;
        _name = "Cercle_" + count;
    }

    public Circle (float radius, EColor color)
    {
        super (color);
        ++count;
        _radius = radius;
        _name = "Cercle_" + count;
    }


    // Getters & Setters for the _radius attribute
    public float radius () { return _radius; }
    public void setRadius (float radius) { _radius = radius; }


    // Implementation of the interface methods
    public float perimeter () { return 2f * Pi * _radius; }
    public float area () { return Pi * _radius * _radius; }

    public void display ()
    {
        System.out.println (_name);
        System.out.println ("Rayon : " + _radius);
        System.out.println ("Pi : " + Pi);
        System.out.println ("Couleur : " + _color);
        System.out.println ("Circonférence : " + perimeter ());
        System.out.println ("Aire : " + area ());
        System.out.println();
    }


    // Class Field for PI
    public static final float Pi = (float) Math.PI;
    private static int count = 0;

    // Instance Field
    private float _radius;
}
