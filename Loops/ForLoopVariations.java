public class ForLoopVariations {
    public static void main(String[] args) {
        
        // 1. Multiple initializations
        System.out.println("=== Multiple variables ===");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i=" + i + ", j=" + j);
        }
        
        // 2. Empty initialization (variable declared outside)
        System.out.println("\n=== Variable outside loop ===");
        int x = 0;
        for (; x < 5; x++) {
            System.out.println("x=" + x);
        }
        
        // 3. Empty condition (infinite loop)
        // for (int i = 0; ; i++) {  // INFINITE!
        //     System.out.println(i);
        //     if (i > 100) break;    // Must have exit condition
        // }
        
        // 4. Empty update (update inside loop)
        System.out.println("\n=== Update inside loop ===");
        for (int i = 0; i < 5; ) {
            System.out.println("i=" + i);
            i++;  // Update manually
        }
        
        // 5. Infinite loop (with break)
        System.out.println("\n=== Infinite with break ===");
        int counter = 0;
        for (;;) {  // Same as while(true)
            System.out.println("Iteration: " + counter);
            counter++;
            if (counter >= 3) break;
        }
    }
}