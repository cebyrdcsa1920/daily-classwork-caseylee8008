import java.awt.Color;

public class House
{
    private String street;
    private int numBath;
    private int numBed;
    private Color color;

    public House()
    {
        street = "Chelsea";
        numBath = 7;
        numBed = 3;
        color = Color.BLUE;
    }
    public String toString()
    {
        return "This is the crib";
    }
}