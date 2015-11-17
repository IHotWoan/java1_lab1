import java.util.Scanner;

/**
 * Created by Felix on 11/11/2015.
 */
public class Vaxelpengar {

    public static void main(String[] args) {


        float erhållet;
        float kostnad;
        int pengar;
        int tusen;
        int femhundra;
        int hundra;
        int femtio;
        int tjugo;
        int tio;
        int fem;
        int ett;


        Scanner cost = new Scanner(System.in);
        System.out.print("ange total kostnad: ");
        kostnad = cost.nextFloat();

        Scanner recived = new Scanner(System.in);
        System.out.print("ange erhållet belopp: ");
        erhållet = recived.nextFloat();

        cost.close();
        recived.close();

        pengar = (int)(erhållet) - (int)(kostnad + 0.5);

        System.out.print("Tillbaka: " + pengar );

        tusen = 0;
        femhundra = 0;
        hundra = 0;
        femtio = 0;
        tjugo = 0;
        tio = 0;
        fem = 0;
        ett = 0;


        while (pengar >= 1000) {                 //using while loops to sort out the minimum bills to return.
            pengar = pengar - 1000;              //then removing from total and adding +1 to the respective variable.
            tusen++;
        }

        while (pengar >= 500) {
            pengar = pengar - 500;
            femhundra++;
        }

        while (pengar >= 100) {
            pengar = pengar - 100;
            hundra++;
        }

        while (pengar >= 50) {
            pengar = pengar - 50;
            femtio++;
        }

        while (pengar >= 20) {
            pengar = pengar - 20;
            tjugo++;
        }

        while (pengar >= 10){
            pengar = pengar - 10;
            tio++;
        }

        while (pengar >= 5 ){
            pengar = pengar - 5;
            fem++;
        }

        while (pengar >= 1 ) {
            pengar = pengar - 1;
            ett++;
        }

        System.out.print("\n1000-lappar: "+tusen+"\n500-lappar: "+femhundra+"\n100-lappar: "+hundra+"\n50-lappar: "
        +femtio+"\n20-lappar: "+tjugo+"\n10-kronor: "+tio+"\n5-kronor: "+fem+"\n1-Kronor: "+ett);

    }

}
