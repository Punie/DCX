package fr.formation.shapes;

public class Triangle extends Shape implements IShape
{
    // CONSTRUCTORS
    // super () calls the constructor of the parent class (Shape)
    public Triangle (float a, float b, float c)
    {
        super ();
        ++count;
        _a = a;
        _b = b;
        _c = c;
        _name = "Triangle_" + count;
    }

    public Triangle (float a, float b, float c, EColor color)
    {
        super ();
        ++count;
        _a = a;
        _b = b;
        _c = c;
        _name = "Triangle_" + count;
    }


    // Getters for selecting the base (arbitrarily chosen from one side of the triangle)
    // and calculating the height (induced field)
    public float base () { return _a; }
    public float height ()
    {
        float x = ((_a * _a) - (_b * _b) + (_c * _c)) / (2f * _a);
        float h2 = (_c * _c) - (x * x);

        return (float) Math.sqrt(h2);
    }


    // Implementation of the interface methods
    public float perimeter () { return _a + _b + _c;}
    public float area () { return base () * height () / 2f; }

    // display () checks the validity of the triangle before displaying its description
    public void display ()
    {
        if (isValid ())
        {
            System.out.println (_name);
            System.out.println ("Base : " + base ());
            System.out.println ("Hauteur : " + height ());
            System.out.println ("Couleur : " + _color);
            System.out.println ("Périmètre : " + perimeter ());
            System.out.println ("Aire : " + area ());
            System.out.println ();
        }
        else
        {
            System.out.println("TRIANGLE " + _name + " IS NOT VALID!");
        }

    }

    // Private method checking the validity of the triangle
    private boolean isValid ()
    {
        Float h = new Float(height ());
        return !h.isNaN();
    }


    // Class Field
    private static int count = 0;

    // Instance Fields
    private float _a, _b, _c;
}
