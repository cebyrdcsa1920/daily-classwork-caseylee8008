import java.awt.Color;

public class Shirt
{
    private String brand;
    private String size;
    private Color color;
    private int numHoles;

    public Shirt()
    {
        brand = "Hanes";
        size = "Large";
        color = Color.WHITE;
        numHoles = 4;
    }

    public String toString()
    {
        return "This is my shirt";
    }
}