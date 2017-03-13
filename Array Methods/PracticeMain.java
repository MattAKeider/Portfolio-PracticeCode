
public class PracticeMain
{
    public static void main(String[] args)
    {
        int[] test = {101, 21, 10, 57, 2000, 90, 10_200, 21, 1_000_000, 52, 7, 16};
        int[] test2 = {21, 23, 2_002, 51, 4_000_004, 200, 100, 3};

        //Largest element
        System.out.println("Largest elements in given arrays.");
        System.out.println("Test: " + ArrayClass.largeEl(test));
        System.out.println("Test2: " + ArrayClass.largeEl(test2));
        System.out.println();

        //Smallest element
        System.out.println("Smallest elements in given arrays.");
        System.out.println("Test: " + ArrayClass.smallEl(test));
        System.out.println("Test2: " + ArrayClass.smallEl(test2));
        System.out.println();

        //Sum of all elements in array
        System.out.println("Sum of all elements.");
        System.out.println("Test: " + ArrayClass.sumOfArray(test));
        System.out.println("Test2: " + ArrayClass.sumOfArray(test2));
        System.out.println();


        //Create new Array of type int
        System.out.println("Enter values: ");
        int[] newArray = ArrayClass.buildSingleIntArray(5);
        System.out.println();

        //Print out newArray
        System.out.println("New array values: ");
        for(int x = 0;x < newArray.length;x++)
        {
            System.out.println("Index" + x + ":" + newArray[x]);
        }
    }

}
