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

    public PetClass(String species, Color color, int age. int legs, double weight, String name)
    {
        this.species = species
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.weight = weight;
        this.name = name;
    }

    public String toString()
    {
        return "This is my pet"
    }
}