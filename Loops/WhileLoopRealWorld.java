import java.util.Scanner;

public class WhileLoopRealWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example 1: PIN validation (3 attempts)
        System.out.println("=== ATM PIN Validation ===");
        int correctPin = 1234;
        int attempts = 0;
        int maxAttempts = 3;
        boolean isValid = false;
        
        while (attempts < maxAttempts && !isValid) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();
            attempts++;
            
            if (enteredPin == correctPin) {
                isValid = true;
                System.out.println("Access granted!");
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (maxAttempts - attempts));
            }
        }
        
        if (!isValid) {
            System.out.println("Too many attempts. Account locked!");
        }
        
        // Example 2: Menu system
        System.out.println("\n=== Calculator Menu ===");
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();
                
                switch (choice) {
                    case 1 -> System.out.println("Result: " + (a + b));
                    case 2 -> System.out.println("Result: " + (a - b));
                    case 3 -> System.out.println("Result: " + (a * b));
                }
            } else if (choice != 4) {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Goodbye!");
        
        // Example 3: Sum until negative number
        System.out.println("\n=== Sum numbers (enter negative to stop) ===");
        int sum = 0;
        int num;
        
        while (true) {  // Infinite loop
            System.out.print("Enter number: ");
            num = scanner.nextInt();
            
            if (num < 0) {
                break;  // Exit when negative
            }
            
            sum += num;
        }
        System.out.println("Sum of positive numbers: " + sum);
        
        scanner.close();
    }
}