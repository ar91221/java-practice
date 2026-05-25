public class ComparisonOperators {
    public static void main(String[] args) {
        int age = 18;
        boolean hasLicense = true;
        
        // Comparison operators (returns boolean)
        System.out.println("Age == 18: " + (age == 18));   // true
        System.out.println("Age != 18: " + (age != 18));   // false
        System.out.println("Age > 21: " + (age > 21));     // false
        System.out.println("Age >= 18: " + (age >= 18));   // true
        System.out.println("Age < 16: " + (age < 16));     // false
        System.out.println("Age <= 21: " + (age <= 21));   // true
        
        // Logical operators
        System.out.println("AND (&&): " + (age >= 18 && hasLicense)); // true
        System.out.println("OR (||): " + (age >= 21 || hasLicense));  // true
        System.out.println("NOT (!): " + !hasLicense);                // false
    }
}