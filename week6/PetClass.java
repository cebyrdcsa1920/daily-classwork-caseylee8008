import java.awt.Color;

public class PetClass
{
    private String species;
    private Color color;
    private int age;
    private int legs;
    private double weight;
    private String name;

    public PetClass()
    {
        species = "Cow";
        color = Color.WHITE;
        age = 4;
        legs = 4;
        weight = 27.8;
        name = "Otis";
    }


    public String toString()
    {
        return "This is my pet";
    }
}