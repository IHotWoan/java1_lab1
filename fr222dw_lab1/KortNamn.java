import java.util.Scanner;
import java.lang.StringBuilder;
/**
 * Created by Felix on 11/12/2015.
 */
public class KortNamn {

    public static void main(String[] args) {

        String förnamn;
        String efternamn;
        int maxF;
        int maxE;



        Scanner förN = new Scanner(System.in);
        System.out.print("skriv in förnamn: ");
        förnamn = förN.nextLine();

        Scanner efterN = new Scanner(System.in);
        System.out.print("skriv in efternamn: ");
        efternamn = efterN.nextLine();

        maxF = förnamn.length();                                    // making new variables to use when later deleting.
        maxE = efternamn.length();

        StringBuilder förstabokstav  = new StringBuilder(förnamn);  // removing characters in the name.
        förstabokstav.delete(1, maxF);

        if (efternamn.length() > 4) {                               //if / else to make it work if last name is shorter
                                                                    //then 4 characters
            StringBuilder lastname = new StringBuilder(efternamn);
            lastname.delete(4, maxE);
            System.out.println("Ditt kortnamn är: " + förstabokstav + ". " + lastname );
        }

        else


        System.out.println("Ditt kortnamn är: " + förstabokstav + ". " + efternamn );








    }

}
