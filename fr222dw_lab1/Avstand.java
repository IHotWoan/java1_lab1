import java.util.Scanner;                               //different import to serve our needs.
import java.lang.Math;
import java.text.DecimalFormat;
/**
 * Created by Felix on 11/12/2015.
 */
public class Avstand {

    public static void main(String[] args) {

        double x1;
        double x2;
        double y1;
        double y2;
        double xx2;
        double yy2;
        double avstånd;


        Scanner förstaX = new Scanner(System.in);
        System.out.print("Detta program räknar ut avståndet mellan två kordinater av formen (x,y).\nSkriv in den första x-kordinaten: ");
        x1 = förstaX.nextDouble();

        Scanner förstaY = new Scanner(System.in);
        System.out.print("skriv in första y-kordinaten: ");
        y1 = förstaY.nextDouble();

        Scanner andraX = new Scanner(System.in);
        System.out.print("skriv in andra x-kordinaten: ");
        x2 = andraX.nextDouble();

        Scanner andraY = new Scanner(System.in);
        System.out.print("Skriv in andra y-kordinaten: ");
        y2 = andraY.nextDouble();

        xx2 = Math.pow(x1-x2,2);                                        //math equation for
        yy2 = Math.pow(y1-y2,2);                                        //Sqrt( (x1-x2)^2 + (y1-y2)^2 )
        avstånd = Math.sqrt(xx2+yy2);

        String längd = "0.##";                                          //makes the final value be 3 digit
        DecimalFormat tresiffrigt = new DecimalFormat(längd);
        String värde = tresiffrigt.format(avstånd);


        System.out.println("Avståndet mellan (x1,y1) och (x2,y2) är: " + värde );


    }
}
