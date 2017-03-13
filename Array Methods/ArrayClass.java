import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayClass
{
    //Find the biggest integer within array
    public static int largeEl(int[] x)
    {
        int big = 0;

        for(int i = 0; i < x.length; i++)
        {
            if(x[i] > big)
            {
                big = x[i];
            }
        }

        return big;
    }

    //Find the smallest integer within array
    public static int smallEl(int[] x)
    {
        //Find largest value in array
        int small = largeEl(x);

        for(int i = 0; i < x.length; i++)
        {
            if(x[i] < small)
            {
                small = x[i];
            }
        }

        return small;
    }

    //Find the sum of array of integers
    public static int sumOfArray(int[] x)
    {
        int sum = 0;

        for(int y:x)
        {
            sum += y;
        }

        return sum;
    }

    //Create and return array of type int
    public static int[] buildSingleIntArray(int arrLength)
    {
        Scanner input = new Scanner(System.in);
        int[] temp = new int[arrLength];

        //Handle InputMismatchException
        try{

            for(int x = 0;x < temp.length;x++)
            {
                System.out.print("Index " + x + ":");
                temp[x] = input.nextInt();
            }

        }catch (InputMismatchException e){

            System.out.println("Must be of type integer!");
        }

        return temp;
    }

}
