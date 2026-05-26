public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // AND (&&) - BOTH conditions must be true
        System.out.println("=== Driver License Eligibility ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a learner's permit? (true/false): ");
        boolean hasPermit = scanner.nextBoolean();
        
        if (age >= 16 && hasPermit) {
            System.out.println(" You can apply for driver's license!");
        } else {
            System.out.println(" You don't meet requirements.");
            if (age < 16) {
                System.out.println("   Reason: Too young (need 16+)");
            }
            if (!hasPermit) {
                System.out.println("   Reason: No learner's permit");
            }
        }
        
        // OR (||) - At least ONE condition must be true
        System.out.println("\n=== Discount Eligibility ===");
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.print("Are you a senior citizen (65+)? (true/false): ");
        boolean isSenior = scanner.nextBoolean();
        System.out.print("Do you have a membership card? (true/false): ");
        boolean hasMembership = scanner.nextBoolean();
        
        if (isStudent || isSenior || hasMembership) {
            System.out.println(" You get 20% discount!");
            
            if (isStudent) System.out.println("   - Student discount applied");
            if (isSenior) System.out.println("   - Senior discount applied");
            if (hasMembership) System.out.println("   - Member discount applied");
        } else {
            System.out.println("No discount available.");
        }
        
        // NOT (!) - Reverses boolean value
        boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("\n It's a weekday. Go to work!");
        }
        
        scanner.close();
    }
}