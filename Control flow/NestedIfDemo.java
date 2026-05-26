public class NestedIfDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Do you have a degree? (true/false): ");
        boolean hasDegree = scanner.nextBoolean();
        
        if (hasDegree) {
            System.out.print("How many years of experience? ");
            int experience = scanner.nextInt();
            
            // Nested if (if inside if)
            if (experience >= 3) {
                System.out.println("✅ You qualify for Senior position!");
                System.out.println("Salary range: $80,000 - $100,000");
            } else if (experience >= 1) {
                System.out.println("✅ You qualify for Junior position!");
                System.out.println("Salary range: $50,000 - $65,000");
            } else {
                System.out.println("✅ You qualify for Internship!");
                System.out.println("Salary range: $35,000 - $40,000");
            }
        } else {
            System.out.println("❌ You need a degree for this position.");
            System.out.println("Consider our apprenticeship program.");
        }
        
        scanner.close();
    }
}