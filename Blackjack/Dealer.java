
public class Dealer
{
    private int dlrCard1;
    private int dlrCard2;
    private int dlrTotal;

    //Constructor to set default values
    public Dealer()
    {
        dlrCard1 = 0;
        dlrCard2 = 0;
        dlrTotal = 0;
    }

    //Getter
    public int getDlrTotal()
    {
        return dlrTotal;
    }

    //Find dealer total
    public void dealerCards()
    {
        dlrCard1 = Cards.randValue();
        checkFor1(dlrCard1);

        dlrCard2 = Cards.randValue();
        checkFor1(dlrCard2);

        dlrTotal = dlrCard1 + dlrCard2;

        System.out.println("Dealer has " + dlrTotal + ".");

    }

    //Check for 1, if so, change to 11
    public int checkFor1(int card)
    {
        int tempCard = card;

        if(tempCard == 1)
        {
            tempCard = 11;
        }

        return tempCard;
    }

}
