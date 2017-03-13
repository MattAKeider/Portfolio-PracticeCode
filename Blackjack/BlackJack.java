
public class BlackJack
{
    public static void main(String[] args)
    {
        Player playerObj = new Player(); //Player object
        Dealer dealObj = new Dealer(); //Dealer object

        System.out.println("Lets play BlackJack!!!");
        System.out.println("______________________");
        System.out.println("\n");
        System.out.println("See if you could beat the dealer!\n");
        System.out.println("Your first two cards are: ");

        //Get first 2 cards
        int card1 = Cards.randValue();
        int card2 = Cards.randValue();

        System.out.print(card1 + " of " + Cards.randSuit() + " and ");
        System.out.println(card2 + " of " + Cards.randSuit());
        System.out.println("");

        //Player chooses to hit or stay
        playerObj.playerChoice(card1, card2);
        //Dealer total
        dealObj.dealerCards();
        System.out.println("");

        if(playerObj.getPlayerTotal() > dealObj.getDlrTotal())
        {
            System.out.println("Player wins!!!!");
        }
        else if(dealObj.getDlrTotal() > 21)
        {
            System.out.println("Dealer Bust!! Player wins!!");
        }
        else if(playerObj.getPlayerTotal() < dealObj.getDlrTotal())
        {
            System.out.println("Dealer wins!!");
        }
        else if(playerObj.getPlayerTotal() == dealObj.getDlrTotal())
        {
            System.out.println("Dealer wins!!");
        }


    }
}
