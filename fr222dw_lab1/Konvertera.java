import java.util.Scanner;
import java.text.DecimalFormat;


/**
 * Created by Felix on 11/12/2015.
 */
public class Konvertera {

    public static void main(String[] args) {

        float fahrenheit;
        float celcius;
        String resultat;

        Scanner värde = new Scanner(System.in);
        System.out.print("skriv in temperaturen i fahrenheit: ");
        fahrenheit = värde.nextFloat();

        celcius = (fahrenheit - 32) * 5 / 9;

        DecimalFormat enDecimal = new DecimalFormat("0.#");             //forming my answer to two digit.
        resultat = enDecimal.format(celcius);
        System.out.print("Det givna värdet i fahrenheit är i celsius: " + resultat );

    }

}
