import java.util.Scanner;

/*
 * Räkna vokaler, konsonanter och skiljetecken
 *
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-17
*/

public class TextStats {
    public static void main(String[] args) {
        String text = args[0];
        int konsonanter = 0;
        int vokaler = 0;
        int skiljetecken = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) > 64 && text.charAt(i) < 91) //Big letters
            {
                if ((text.charAt(i) == 65) || (text.charAt(i) == 69) || (text.charAt(i) == 73) || (text.charAt(i) == 79) || (text.charAt(i) == 85)){ // AEIOU letters
                    vokaler += 1;
                } else{
                    konsonanter += 1;
                }
            } else if (text.charAt(i) > 96 && text.charAt(i) < 123){ //Small letters
                if ((text.charAt(i) == 97) || (text.charAt(i) == 101) || (text.charAt(i) == 105) || (text.charAt(i) == 111) || (text.charAt(i) == 117)){ // aeiou letters
                    vokaler += 1;
                } else{
                    konsonanter += 1;
                }
            } else if ((text.charAt(i) == 46) || (text.charAt(i) == 32) || (text.charAt(i) == 33) || (text.charAt(i) == 63) || (text.charAt(i) == 44) || (text.charAt(i) == 58) || (text.charAt(i) == 59) || (text.charAt(i) == 45)){ //SPACE . ! = , ; : - symbols
                skiljetecken += 1;
                }
            }
        System.out.println("Consonants: " + konsonanter + ", vowels: " + vokaler + ", punctuations: " + skiljetecken);
    }
}