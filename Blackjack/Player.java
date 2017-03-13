import java.util.Scanner;

public class Player
{
    Scanner myInput = new Scanner(System.in); //Scanner object
    Dealer dObject = new Dealer(); //Dealer object

    private int playerTotal;
    private int extraCard;
    private String choice;

    //Constructor to set default values
    public Player()
    {
        playerTotal = 0;
        extraCard = 0;
        choice = "";
    }

    //Returns the playerTotal
    public int getPlayerTotal()
    {
        return playerTotal;
    }

    //Players chooses to hit or stay.
    public void playerChoice(int card1, int card2)
    {
        playerTotal = card1 + card2;

        do
        {
            System.out.println("Your total is " + playerTotal + ".");
            System.out.println("Hit or Stay?");

            choice = myInput.next();

            if(choice.equalsIgnoreCase("Hit"))
            {
                hit();
            }
            else if(choice.equalsIgnoreCase("Stay"))
            {
                System.out.println("You are staying with " + playerTotal + ".");
                break;
            }
            else
            {
                System.out.println("Invalid choice. Dealer automatically wins!!!");
                System.exit(0);
            }

        }while(playerTotal <= 21);

    }

    //If player chooses to hit and add another card.
    public void hit()
    {
        extraCard = Cards.randValue();
        System.out.println("Your next card is " + extraCard + " of " + Cards.randSuit() +  ".");

        playerTotal += extraCard;
        System.out.println("Your new card total is " + playerTotal + ".");

        if((playerTotal == 21) && (dObject.getDlrTotal() != 21))
        {
            System.out.println("BlackJack!!! You win!!!!");
            System.exit(0);
        }
        else if(playerTotal > 21)
        {
            System.out.println("Bust!!!! Dealer wins!!!");
            System.exit(0);
        }
    }
}
