
public class Duplicates
{
    public static void main(String[] args)
    {
        int[] nums = {5,2,3,3,4,4,5,6,6,7,8,9,10};

        for(int x:duplicates(nums))
        {
            System.out.println(x);
        }
    }

    //duplicates() method accepts an array and returns duplicates in array
    public static int[] duplicates(int[] intArray)
    {
        //New array to hold duplicates
        int[] newArray = new int[intArray.length];
        int index = 0;

        for(int x=0;x<intArray.length;x++)
        {
            //Compare copy of intArray without counting element currently in outer loop
            for(int y = x+1;y<intArray.length;y++)
            {
                //If duplicate, add to newArray, index++
                if(intArray[y] == intArray[x])
                {
                    newArray[index] = intArray[y];
                    index++;
                }
            }
        }

        return newArray;
    }
}
