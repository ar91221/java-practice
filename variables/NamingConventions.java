// Naming Conventions (Indudtry Standard)
public class NamingConventions {
    public static void main(String[] args) {
        
        // GOOD NAMES (camelCase for variables)
        int studentAge = 20;
        String firstName = "John";
        double salaryPerHour = 25.50;
        boolean hasValidLicense = true;
        
        //  BAD NAMES (don't do these!)
        int a = 20;              // Not descriptive
        String b = "John";       // Meaningless
        double s = 25.50;        // What is 's'?
        int studentage = 20;     // Should be camelCase
        int StudentAge = 20;     // Capital S (that's for classes!)
        
        // Constants (ALL_CAPS with underscores)
        final double PI = 3.14159;
        final int MAX_STUDENTS = 30;
        final String COMPANY_NAME = "TechCorp";
    }
}