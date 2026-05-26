import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I'm thinking of a number between 1 and 100");
        
        boolean playAgain = true;
        int totalGames = 0;
        int totalAttempts = 0;
        
        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;
            
            System.out.println("\n--- New Game! You have " + maxAttempts + " attempts ---");
            
            while (attempts < maxAttempts && !guessed) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == secretNumber) {
                    System.out.println("CORRECT! You got it in " + attempts + " attempts!");
                    guessed = true;
                    totalAttempts += attempts;
                    totalGames++;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try higher.");
                } else {
                    System.out.println("Too high! Try lower.");
                }
                
                // Give hint after 5 attempts
                if (attempts == 5 && !guessed) {
                    if (secretNumber % 2 == 0) {
                        System.out.println("Hint: The number is even!");
                    } else {
                        System.out.println("Hint: The number is odd!");
                    }
                }
            }
            
            if (!guessed) {
                System.out.println("\nOut of attempts! The number was: " + secretNumber);
            }
            
            // Show statistics
            if (totalGames > 0) {
                double avgAttempts = (double) totalAttempts / totalGames;
                System.out.printf("\nStats: %d games | Avg attempts: %.1f\n", 
                                 totalGames, avgAttempts);
            }
            
            // Ask to play again with validation
            boolean validResponse = false;
            while (!validResponse) {
                System.out.print("\nPlay again? (yes/no): ");
                String response = scanner.next().toLowerCase();
                
                if (response.equals("no")) {
                    playAgain = false;
                    validResponse = true;
                } else if (response.equals("yes")) {
                    validResponse = true;
                } else {
                    System.out.println("Please answer 'yes' or 'no'");
                }
            }
        }
        
        System.out.println("\nThanks for playing!");
        scanner.close();
    }
}