import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner object for user input
        Scanner input = new Scanner(System.in);
        String password, realPassword;
        //Total number of tries to gain access
        int noTries = 5;

        System.out.println("---------- Password Screen ----------");
        System.out.println("\n\n");

        //Prompt to set password
        System.out.print("Pick your password: ");
        realPassword = input.next();
        System.out.println("Password set!\n");

        //loop through as long as number of tries is greater than 0
        do{
            System.out.print("Enter Password: ");
            password = input.next();

            //If password equals password stored, grant access
            if(password.equals(realPassword))
            {
                System.out.println("Access Granted!!");
                break;
            }

            noTries--; //Decrement noTries

            //If noTries equals 0, exit
            if(noTries == 0)
            {
                System.out.println("No more tries.");
            }
            else //Else, give prompt to try again
            {
                System.out.println("Denied! Try again!");
                System.out.println(noTries + " tries left!\n");
            }

        }while(noTries > 0);

    }

}
