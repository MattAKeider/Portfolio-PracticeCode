import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt
        System.out.println("---------- Magic 8 Ball ----------\n");
        System.out.println("Ask a question that requires a yes or no answer.");
        //Input given
        input.nextLine();
        //Response
        System.out.println(Util8Class.response());
    }
}
