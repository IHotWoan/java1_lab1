/**
 * Created by Felix on 11/10/2015.
 */
public class Sekunder {

    public static void main(String[] args) {

        int timmar = 8;
        int minuter = 25;
        int sekunder = 45;

        int totalS = timmar*60*60 + minuter*60 + sekunder;

        System.out.print("timmar = 8\nMinuter = 25\nSekunder = 45\n");

        // string.format with &d serves as a placeholder.
        System.out.println(String.format("Totala antalet sekunder: %d",totalS));

    }
}
