public class ForLoopPatterns {
    public static void main(String[] args) {
        
        // Pattern 1: Sum of numbers
        System.out.println("=== Sum 1 to 100 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;  // sum = sum + i
        }
        System.out.println("Sum = " + sum);  // 5050
        
        // Pattern 2: Factorial
        System.out.println("\n=== Factorial of 5 (5!) ===");
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;  // factorial = factorial * i
            System.out.println(i + "! = " + factorial);
        }
        
        // Pattern 3: Multiplication table
        System.out.println("\n=== Multiplication Table of 7 ===");
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %d = %d%n", number, i, number * i);
        }
        
        // Pattern 4: Find maximum
        System.out.println("\n=== Find maximum in array-like sequence ===");
        int[] numbers = {23, 45, 12, 67, 34, 89, 21};
        int max = numbers[0];  // Assume first is largest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum is: " + max);
        
        // Pattern 5: Check for prime
        System.out.println("\n=== Check if 17 is prime ===");
        int num = 17;
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // Found a divisor, no need to continue
                }
            }
        }
        System.out.println(num + " is prime: " + isPrime);
    }
}