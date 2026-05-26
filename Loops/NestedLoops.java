public class NestedLoops {
    public static void main(String[] args) {
        
        System.out.println("=== Multiplication Table ===");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();  // New line after each row
        }
        
        System.out.println("\n=== Pattern 1: Rectangle ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Pattern 2: Right Triangle ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Pattern 3: Inverted Triangle ===");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Pattern 4: Pyramid ===");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}