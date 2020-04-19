//import java.util.Scanner;
import java.util.*;

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.print("What is your name?");
        String name = in.nextLine();

        //get second input
        System.out.print("how old are you?");
        int age = in.nextInt();

       //display output on console
        System.out.print("Hello," + name + ".Next year, you'll be " + (age + 1));


    }
}
