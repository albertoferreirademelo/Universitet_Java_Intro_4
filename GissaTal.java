import java.util.Scanner;

/*
 * Gissa-tal spelet
 *
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-16
*/

public class GissaTal {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in);

        int lBound = (int) (Math.random () * -100) - 1;
        int uBound = (int) (Math.random() * 100) + 1;
        int actualNumber = (int)(Math.random () * (uBound - lBound + 1)) + lBound;
        int guess = -111;

        System.out.println("Guess-a-Number-Game");
        System.out.println("I know a secret number between "+ lBound + " and " + uBound + ".");
        System.out.println("Can you guess it?");
        while (actualNumber != guess)
        {
            System.out.print("Your guess: ");
            guess = inputReader.nextInt();

            if (guess < actualNumber){
                System.out.println("Your guess is too small.");
            } else if (guess > actualNumber){
                System.out.println("Your guess is too big.");
            }
        }
        System.out.println("You're right: The secret number is " + actualNumber + ".");
        inputReader.close();
    }
}