import java.util.Scanner;

public class TicTacToeTest
{
    public static void main(String[] args)
    {
        //Scanner object to get user input
        Scanner myInput = new Scanner(System.in);
        //GameBoard object
        GameBoard gameObj = new GameBoard();

        int row;
        int column;
        boolean endGame = false;

        System.out.println("Welcome to tic-tac-toe!\n");
        System.out.println("_______________________");
        System.out.println();

        //Initialize GameBoard
        gameObj.drawGameBoard();
        System.out.println();

        System.out.println("Player 1 is X.");

        //Continue looping until endGame is true
        while(!endGame)
        {
            System.out.println("Pick board position for your mark.");
            System.out.println("|(0,0)|(0,1)|(0,2)|");
            System.out.println("|(1,0)|(1,1)|(1,2)|");
            System.out.println("|(2,0)|(2,1)|(2,2)|");
            System.out.println();

            //Check to see spot is already taken
            do{
                row = myInput.nextInt();
                column = myInput.nextInt();
                System.out.println();

            }while(!gameObj.checkPickEmpty(row, column));

            //Change board position to 'X' or 'O'
            gameObj.placeXOrO();
            //Redraw board
            gameObj.reDrawGameBoard();
            System.out.println();

            //Increment turn
            gameObj.turnPlus1();
            //Check for winner or tie
            endGame = gameObj.checkWinnerOrTie();
        }
    }
}



