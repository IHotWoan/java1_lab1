import java.util.Scanner;

/**
 * Created by Felix on 11/10/2015.
 */
public class Citat {

    public static void main(String[] args) {

        String input;

        Scanner userInput =new Scanner(System.in);      //using scanner to get user input
        System.out.print("skriv in ett citat: ");
        input = userInput.nextLine();

        System.out.print("\"" + input + "\"");
    }
}
