import java.util.Scanner;           //imports when adding scanner

/**
 * Created by Felix on 11/11/2015.
 */
public class BMI {

    public static void main(String[] args) {

        double kg;
        double meter;
        double temp;
        int bmi;

        System.out.println("Det här programmet hjälper dig att räkna ut ditt BMI.");

        Scanner weight = new Scanner(System.in);                       //using scanner to get user input
        System.out.print("Skriv in din vikt i kilogram: ");
        kg = weight.nextDouble();

        Scanner length = new Scanner(System.in);
        System.out.print("Skriv in din längd i meter: ");
        meter = length.nextDouble();

        temp = kg/(meter*meter);
        bmi = (int)(temp + 0.5);                                           //converts float to int
                                                                           //using + 0.5 to get the correct value
        System.out.println("Ditt BMI är: " + bmi );                        //when rounding of to int


    }

}
