import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        String w = "Hello!";

        System.out.println(reverse());
        System.out.println(reverse(w));
    }

    //Reverse a String given by user using Scanner, then return value
    public static String reverse()
    {
        System.out.print("Enter String: ");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String newString = new StringBuilder(x).reverse().toString();

        return newString;
    }

    //Overloaded reverse() method with 1 String parameter
    public static String reverse(String input)
    {
        String newString = new StringBuilder(input).reverse().toString();

        return newString;
    }
}
