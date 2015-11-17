import java.util.Scanner;
/**
 * Created by Felix on 11/11/2015.
 */
public class SummanAvTre {

    public static void main(String[] args) {

        int nummer;
        int första;
        int andra;
        int tredje;
        int summa;
        float temp;

        Scanner tal = new Scanner(System.in);
        System.out.print("Skriv in ett tresiffrigt tal: ");
        nummer = tal.nextInt();

        temp = nummer /100;                             // taking out the first digit in our number saving it i första
        första = (int)temp;

        temp = nummer - (första*100);                   //taking out the second digit and saving it in andra
        andra = (int)temp/10;

        temp = nummer - (första*100 + andra*10);        // taking out the last digit and saving it in tredje.
        tredje = (int)temp;

        summa = första + andra + tredje;

        System.out.print("summan av siffrorna i heltalet är: " + summa );



    }

}
