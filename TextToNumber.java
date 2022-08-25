/*
 * Text to Number
 *
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-17
*/

public class TextToNumber {
    public static void main(String[] args) {
        String userInput = args[0];
        double sumNumbers = 0.0;
        
        for (int i = 0; i < userInput.length(); i++){ // for each char
            if (userInput.charAt(i) > 47 && userInput.charAt(i) < 58){ // for each number between 0 and 9
                sumNumbers += (userInput.charAt(i) - 48) * Math.pow(10, (userInput.length()-i-1)); // Transforming the characters to integer
            }
        }
        System.out.println("Number: " + userInput + ", number/10.0: " + (sumNumbers/10));
    }    
}