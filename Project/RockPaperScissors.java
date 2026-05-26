import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== ROCK PAPER SCISSORS ===");
        System.out.println("Welcome to the game!");
        
        int playerScore = 0;
        int computerScore = 0;
        int rounds = 0;
        
        System.out.print("How many rounds do you want to play? ");
        int maxRounds = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        while (rounds < maxRounds) {
            rounds++;
            System.out.println("\n--- ROUND " + rounds + " ---");
            System.out.println("Score: You " + playerScore + " - " + computerScore + " Computer");
            
            // Get player choice
            System.out.print("Choose (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            
            // Validate input
            if (!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice! Round forfeited.");
                computerScore++;
                continue;
            }
            
            // Computer choice
            int computerNum = random.nextInt(3); // 0, 1, or 2
            String computerChoice;
            switch (computerNum) {
                case 0 -> computerChoice = "rock";
                case 1 -> computerChoice = "paper";
                default -> computerChoice = "scissors";
            }
            
            System.out.println("Computer chose: " + computerChoice);
            
            // Determine winner
            String winner = determineWinner(playerChoice, computerChoice);
            
            // Update score
            if (winner.equals("player")) {
                playerScore++;
                System.out.println("You win this round!");
            } else if (winner.equals("computer")) {
                computerScore++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        
        // Game over - Display final results
        displayFinalResults(playerScore, computerScore, maxRounds);
        
        scanner.close();
    }
    
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "tie";
        }
        
        // Player wins scenarios
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "player";
        }
        
        return "computer";
    }
    
    public static void displayFinalResults(int playerScore, int computerScore, int totalRounds) {
        System.out.println("\n=== GAME OVER ===");
        System.out.println("Total Rounds: " + totalRounds);
        System.out.println("Final Score:");
        System.out.println("  You: " + playerScore);
        System.out.println("  Computer: " + computerScore);
        
        System.out.println("\n=== RESULT ===");
        if (playerScore > computerScore) {
            System.out.println(" YOU WIN THE GAME! ");
            System.out.println("Congratulations! Great strategy!");
        } else if (computerScore > playerScore) {
            System.out.println(" Computer wins the game! Better luck next time!");
        } else {
            System.out.println(" It's a TIE game! Well played!");
        }
        
        // Calculate win percentage
        if (playerScore + computerScore > 0) {
            double winPercentage = (playerScore * 100.0) / (playerScore + computerScore);
            System.out.printf("\nWin Rate: %.1f%%\n", winPercentage);
            
            // Provide feedback based on performance
            if (winPercentage >= 70) {
                System.out.println(" Amazing performance! You're a pro!");
            } else if (winPercentage >= 50) {
                System.out.println(" Good job! Keep practicing!");
            } else if (winPercentage > 0) {
                System.out.println(" Good effort! Try analyzing patterns!");
            } else {
                System.out.println(" Keep playing! You'll get better!");
            }
        }
    }
}