import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // Generates 1 to 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I've selected a number between 1 and 100. Try to guess it!");

        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("\nCongratulations! You guessed the correct number: " + targetNumber);
                System.out.println("Total attempts: " + attempts);
            }
        }

        scanner.close();
    }
}
