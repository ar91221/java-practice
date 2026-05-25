public class IncrementOperators {
    public static void main(String[] args) {
        int counter = 5;
        
        // Post-increment (use current value, THEN increment)
        System.out.println("counter++: " + counter++);  // Prints 5, then becomes 6
        System.out.println("After post-increment: " + counter); // 6
        
        // Pre-increment (increment, THEN use new value)
        System.out.println("++counter: " + ++counter);  // Becomes 7, then prints 7
        
        // Same for decrement
        int value = 10;
        System.out.println("value--: " + value--);  // Prints 10, becomes 9
        System.out.println("--value: " + --value);  // Becomes 8, prints 8
    }
}