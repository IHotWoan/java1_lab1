import java.util.Random;
/**
 * Created by Felix on 11/12/2015.
 */
public class TelefonNummer {

    public static void main(String[] args) {

        int noll = 0;
        int ett;
        int två;
        int tre;
        int fyra;
        int fem;
        int sex;
        int sju;
        int åtta;
        int nio;

        Random slump =new Random();

        ett = slump.nextInt(10);                    // adding random numbers to specific variable.
        två = slump.nextInt(10);
        tre = slump.nextInt(10);
        fyra = 1 + slump.nextInt(9);
        fem = slump.nextInt(10);
        sex = slump.nextInt(10);
        sju = slump.nextInt(10);
        åtta = slump.nextInt(10);
        nio = slump.nextInt(10);

        System.out.print("Det slumpade telefonnummret är: " +noll+ett+två+tre+"-"+fyra+fem+sex+sju+åtta+nio);


    }
}
