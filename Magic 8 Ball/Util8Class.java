import java.util.Random;

public class Util8Class
{
    //Random object
    private static Random rand = new Random();

    //Generate random integer
    private static int randNumber()
    {
        return rand.nextInt(5) + 1;
    }

    //Return a response depending on random number
    public static String response()
    {
        String res = "";

        switch(randNumber()){
            case 1:
                res = "Yes";
                break;
            case 2:
                res = "No";
                break;
            case 3:
                res = "Maybe";
                break;
            case 4:
                res = "You Do Not Want To Know!";
                break;
            case 5:
                res = "No Response";
        }

        return res;
    }

}
