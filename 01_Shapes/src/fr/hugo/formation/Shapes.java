package fr.hugo.formation;

public class Shapes
{
    public static void main(String[] args)
    {
        EColor blue = EColor.BLEU;
        EColor red = EColor.ROUGE;
        EColor grey = EColor.GRIS;
        EColor green = EColor.VERT;

        // Test objects
        float r = 3f;
        Circle circle = new Circle (r, blue);

        float l = 3f, w = 2f;
        Rectangle rect = new Rectangle (l, w);
        rect.setColor (red);

        float d = 5f;
        Square square = new Square (d, grey);

        float a = 21f, b = 17f, c = 10f;
        Triangle triangle = new Triangle (a, b, c);
        triangle.setColor(green);

        Triangle badTriangle = new Triangle (3f, 1f, 1f); 	// Triangle not valid on purpose

        circle.display ();
        rect.display ();
        square.display ();
        triangle.display ();
        badTriangle.display();
    }
}
