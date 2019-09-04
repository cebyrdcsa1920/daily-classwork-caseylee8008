import java.awt.Color;

public class CarClass
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;

    public CarClass()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 2;
        amountOfGas = 12.4;

    }
    public String toString()
    {
        return "This is my Mustang";
    }

}