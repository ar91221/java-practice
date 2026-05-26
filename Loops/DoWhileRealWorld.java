public class DoWhileBasics {
    public static void main(String[] args) {
        
        System.out.println("=== Do-while vs While ===");
        
        // While - might not execute at all
        int x = 10;
        while (x < 5) {
            System.out.println("While: " + x);  // NEVER runs
        }
        
        // Do-while - executes at least once
        int y = 10;
        do {
            System.out.println("Do-while: " + y);  // Runs once!
            y++;
        } while (y < 5);
        
        System.out.println("\n=== Menu with do-while (runs at least once) ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("Hello! 👋");
                case 2 -> System.out.println("Goodbye! 👋");
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 3);
        
        scanner.close();
    }
}