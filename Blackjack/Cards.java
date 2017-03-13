import java.util.Random;

public class Cards
{
    //Random object to create random number
    private static Random randNum = new Random();
    private static String cardSuit[] = {"Hearts","Diamonds","Clubs","Spades"};

    //Get card value
    public static int randValue()
    {
        int rand = randNum.nextInt(11) + 1;

        if(rand == 1)
        {
            rand++;
        }

        return rand;
    }

    //Get card suit
    public static String randSuit()
    {
        int index = randNum.nextInt(cardSuit.length);

        return cardSuit[index];
    }


}

