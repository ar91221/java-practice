import java.util.Scanner;  // Must import at top!

public class UserInputDemo {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== User Registration ===");
        
        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads entire line
        
        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Double input
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();
        
        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Clear buffer (important after nextLine() with other inputs)
        scanner.nextLine();  // Consume leftover newline
        
        // String input (after numbers)
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        // Display results
        System.out.println("\n=== Registration Complete ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Student: " + isStudent);
        System.out.println("City: " + city);
        
        // Always close Scanner (good practice)
        scanner.close();
    }
}