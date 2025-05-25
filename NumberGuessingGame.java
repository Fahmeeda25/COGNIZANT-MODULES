import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToguess = rand.nextInt(100)+1; 
        int guess;
        System.out.println("guess a number between 1 and 100:");
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess < numberToguess) {
                System.out.println("Too low.Try again!");
            } else if (guess > numberToguess) {
                System.out.println("Too high.Try again!");
            } else {
                System.out.println("Correct! You guessed the number");
            }

        } while (guess != numberToguess);

        sc.close();
    }
}
