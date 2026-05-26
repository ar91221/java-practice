public class SwitchFallThrough {
    public static void main(String[] args) {
        int month = 2;
        
        System.out.println("=== WITHOUT BREAK (Fall-through) ===");
        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");  // Prints this
            case 3:
                System.out.println("March");     // AND this!
            case 4:
                System.out.println("April");     // AND this!
            default:
                System.out.println("Invalid");   // AND this!
        }
        
        System.out.println("\n=== WITH BREAK (Correct way) ===");
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;  // Stops here
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Invalid");
        }
        
        // Useful fall-through example (grouping cases)
        System.out.println("\n=== USEFUL Fall-through ===");
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Passing grade!");
                break;
            case 'D':
                System.out.println("Marginal grade");
                break;
            case 'F':
                System.out.println("Failing grade");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}