public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        // Basic operations
        System.out.println("Addition: " + (a + b));        // 13
        System.out.println("Subtraction: " + (a - b));     // 7
        System.out.println("Multiplication: " + (a * b));  // 30
        System.out.println("Division: " + (a / b));        // 3 (INTEGER division!)
        System.out.println("Modulus (remainder): " + (a % b)); // 1
        
        // Integer vs Double division
        int x = 5, y = 2;
        System.out.println("5/2 as int: " + (x / y));      // 2 (not 2.5!)
        
        double p = 5.0, q = 2.0;
        System.out.println("5.0/2.0: " + (p / q));         // 2.5
        
        // Casting to get decimal division
        System.out.println("5/2 as double: " + ((double) x / y)); // 2.5
    }
}