import java.util.Scanner;
/*
 * Multiplikationstabell
 *
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-16
*/

public class Multiplikationstabell {
    public static void main(String[] args) {
        String aString = args[0];
        int multiNumber = (new Scanner(aString).nextInt());

        for (int r = 1; r <= multiNumber; r++)
        {
            for (int c = 1; c <= multiNumber; c++)
            {
                System.out.printf(" %3d", (r*c));
            }
            System.out.println();
        }
    }
}