import java.util.Scanner;

public class Color
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        String fav = keyboard.nextLine();

        if(fav.equals("blue"))
        {
            System.out.println("This is correct.");
        }
        else
        {
            System.out.println("Wrong!");
        }

    }
}