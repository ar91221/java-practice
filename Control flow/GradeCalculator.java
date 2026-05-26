// Grade Calculator using if-else if-else ladder
public class GradeCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        
        // Multiple conditions
        if (score >= 90) {
            System.out.println("Grade: A+ ");
            System.out.println("Excellent work!");
        } else if (score >= 80) {
            System.out.println("Grade: A ");
            System.out.println("Great job!");
        } else if (score >= 70) {
            System.out.println("Grade: B ");
            System.out.println("Good work!");
        } else if (score >= 60) {
            System.out.println("Grade: C ");
            System.out.println("Satisfactory, keep improving!");
        } else if (score >= 50) {
            System.out.println("Grade: D ");
            System.out.println("Need more effort!");
        } else {
            System.out.println("Grade: F ");
            System.out.println("Please seek help and retake course!");
        }
        
        scanner.close();
    }
}