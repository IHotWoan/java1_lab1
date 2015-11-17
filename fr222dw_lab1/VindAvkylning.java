import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

/**
 * Created by Felix on 11/16/2015.
 */
public class VindAvkylning {

    public static void main(String[] args) {

        double celsius;
        double vind;
        double första;
        double andra;
        double tredje;
        double summa;
        String resultat;

        Scanner temperatur = new Scanner(System.in);
        System.out.print("Skriv in temperaturen: ");
        celsius = temperatur.nextDouble();

        Scanner blåst = new Scanner(System.in);
        System.out.print("Skriv in vindhastighet: ");
        vind = blåst.nextDouble();

        temperatur.close();
        blåst.close();

        första = (celsius * 0.6215) + 13.126667;                //splitting up the method to make it simpler.
        andra = Math.pow(vind,0.16) * 13.924748;
        tredje = Math.pow(vind,0.16) * celsius * 0.4875195;

        summa = första - andra + tredje;                        // putting the method together.

        DecimalFormat svar = new DecimalFormat("0");            //deciding how i want the result presented.
        resultat = svar.format(summa);

        System.out.print("Effektiv temperatur: "+ resultat +" grader celsius.");


    }

}
