public class IfElseDemo {
    public static void main(String[] args) {
        int temperature = 30;
        
        if (temperature > 25) {
            System.out.println("It's hot outside! ");
            System.out.println("Wear shorts and t-shirt");
        } else {
            System.out.println("It's cool outside! ");
            System.out.println("Wear a jacket");
        }
        
        // Example with user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();
        
        if (score >= 60) {
            System.out.println(" You passed!");
        } else {
            System.out.println(" You failed. Keep practicing!");
        }
        
        scanner.close();
    }
}