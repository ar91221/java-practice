public class WhileLoopBasics {
    public static void main(String[] args) {
        
        System.out.println("=== Count to 5 with while ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;  // DON'T forget this or infinite loop!
        }
        
        // Compare for vs while:
        System.out.println("\n=== For vs While ===");
        
        // For loop - when you know how many times
        for (int j = 1; j <= 5; j++) {
            System.out.print(j + " ");
        }
        
        // While loop - when you don't know
        System.out.println("\nRolling dice until we get 6:");
        java.util.Random random = new java.util.Random();
        int roll = 0;
        int attempts = 0;
        while (roll != 6) {
            roll = random.nextInt(6) + 1;  // 1-6
            attempts++;
            System.out.println("Roll " + attempts + ": " + roll);
        }
        System.out.println("Got 6 after " + attempts + " attempts!");
    }
}