public class ForLoopBasics {
    public static void main(String[] args) {
        
        // Syntax: for(initialization; condition; update) { body }
        
        System.out.println("=== Count 1 to 5 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // Let's trace through this loop:
        // i=1: 1 <= 5? true → print → i++ (i=2)
        // i=2: 2 <= 5? true → print → i++ (i=3)
        // i=3: 3 <= 5? true → print → i++ (i=4)
        // i=4: 4 <= 5? true → print → i++ (i=5)
        // i=5: 5 <= 5? true → print → i++ (i=6)
        // i=6: 6 <= 5? false → EXIT loop
        
        System.out.println("\n=== Count 5 to 1 (Backwards) ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Count: " + i);
        }
        
        System.out.println("\n=== Count by 2s ===");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}