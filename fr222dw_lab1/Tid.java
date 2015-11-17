import java.util.Scanner;
/**
 * Created by Felix on 11/11/2015.
 */
public class Tid {

    public static void main(String[] args) {

        float time;
        int hours;
        int minutes;
        int seconds;
        float temp;

        Scanner tid = new Scanner(System.in);
        System.out.print("Skriv in antalet sekunder som ska delas upp: ");
        time = tid.nextInt();

        temp = time;

        hours = (int)temp/60/60;            //taking out the correct amount of hours.

        temp = time - hours*60*60;          //setting temp to the remaining amount of time after hours is removed.
        minutes = (int)temp/60;             //setting the amount of minutes we get.

        temp = time - (hours*60*60 + minutes*60); //setting temp to the remaining seconds after hours and minutes
                                                  //hes been removed.
        seconds = (int)temp;

        System.out.print("Antalet timmar: " + hours +"\nAntalet minuter: " + minutes + "\nAntalet sekunder: "+ seconds );




    }

}
