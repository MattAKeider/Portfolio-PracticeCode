public class GameBoard
{
    private static char board[][] = new char[3][3];
    private static int turn = 1;
    private int row;
    private int column;

    //Increment turn
    public void turnPlus1()
    {
        turn++;
    }

    //Initialize GameBoard
    public void drawGameBoard()
    {
        for(int row=0;row<board.length;row++)
        {
            for(int column=0;column<board[row].length;column++)
            {
                board[row][column] = '*';
                System.out.print("|" + board[row][column]);
            }
            System.out.println("|");
        }
    }

    //Redraw GameBoard after each turn
    public void reDrawGameBoard()
    {
        for(int row=0;row<board.length;row++)
        {
            for(int column=0;column<board[row].length;column++)
            {
                System.out.print("|" + board[row][column]);
            }
            System.out.println("|");
        }
    }

    //Check if spot is empty
    public boolean checkPickEmpty(int row, int column)
    {
        this.row = row;
        this.column = column;

        if((board[row][column] == 'X') || (board[row][column] == 'O'))
        {
            System.out.println("Spot taken, Try again!!");
            return false;
        }

        return true;
    }

    //Place 'X' or 'O' depending on who's turn it is
    public void placeXOrO()
    {
        if(!(turn % 2 == 0))
        {
            board[row][column] = 'X';
        }
        else if(turn % 2 == 0)
        {
            board[row][column] = 'O';
        }
    }

    //Check for winner or tie game
    public boolean checkWinnerOrTie()
    {
        if(((board[0][0] == 'X')&&(board[0][1] == 'X')&&(board[0][2] == 'X')) ||
                ((board[1][0] == 'X')&&(board[1][1] == 'X')&&(board[1][2] == 'X')) ||
                ((board[2][0] == 'X')&&(board[2][1] == 'X')&&(board[2][2] == 'X')) ||
                ((board[0][0] == 'X')&&(board[1][0] == 'X')&&(board[2][0] == 'X')) ||
                ((board[0][1] == 'X')&&(board[1][1] == 'X')&&(board[2][1] == 'X')) ||
                ((board[0][2] == 'X')&&(board[1][2] == 'X')&&(board[2][2] == 'X')) ||
                ((board[0][0] == 'X')&&(board[1][1] == 'X')&&(board[2][2] == 'X')) ||
                ((board[0][2] == 'X')&&(board[1][1] == 'X')&&(board[2][0] == 'X')))
        {
            System.out.println("X Wins!!!!!");
            return true;
        }
        else if(((board[0][0] == 'O')&&(board[0][1] == 'O')&&(board[0][2] == 'O')) ||
                ((board[1][0] == 'O')&&(board[1][1] == 'O')&&(board[1][2] == 'O')) ||
                ((board[2][0] == 'O')&&(board[2][1] == 'O')&&(board[2][2] == 'O')) ||
                ((board[0][0] == 'O')&&(board[1][0] == 'O')&&(board[2][0] == 'O')) ||
                ((board[0][1] == 'O')&&(board[1][1] == 'O')&&(board[2][1] == 'O')) ||
                ((board[0][2] == 'O')&&(board[1][2] == 'O')&&(board[2][2] == 'O')) ||
                ((board[0][0] == 'O')&&(board[1][1] == 'O')&&(board[2][2] == 'O')) ||
                ((board[0][2] == 'O')&&(board[1][1] == 'O')&&(board[2][0] == 'O')))
        {
            System.out.println("O Wins!!!!");
            return true;
        }
        else if(checkTie())
        {
            System.out.println("Tie Game!!!!");
            return true;
        }

        return false;

    }

    //Check for tie
    public boolean checkTie()
    {
        for(int row=0;row<board.length;row++)
        {
            for(int column=0;column<board[row].length;column++)
            {
                if(board[row][column] == '*')
                {
                    return false;
                }
            }
        }

        return true;
    }


}
