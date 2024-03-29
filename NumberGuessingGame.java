import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        int secretNumber, guess, guessNum = 0;

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        secretNumber = generator.nextInt(101) + 1;

        while (playAgain.equals("y") || playAgain.equals("Y")) {
            System.out.println("Hey Welcome to the game \nGuess a number between 1 and 100");
            System.out.println("Guess a number (0 to quit):");

            guess = sc.nextInt();
            guessNum = 0;
            while (guess != 0) {
                guessNum++;
                if (guess == secretNumber) {
                    System.out.println("Perfect! You got it Right!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
                } else if (guess > secretNumber) {
                    System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
                }

            }

        }
    }
}
