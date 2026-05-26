public class TernaryOperator {
    public static void main(String[] args) {
        int age = 20;
        
        // Long way
        String status;
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }
        
        // Short way (Ternary operator)
        // variable = condition ? value_if_true : value_if_false;
        String shortStatus = (age >= 18) ? "Adult" : "Minor";
        
        System.out.println("Status: " + shortStatus);
        
        // More examples
        int number = 7;
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + parity);
        
        int score = 85;
        char grade = (score >= 90) ? 'A' : 
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' : 'F';
        System.out.println("Grade: " + grade);
        
        // Ternary in print statement
        int x = 10, y = 20;
        System.out.println("Larger number is: " + ((x > y) ? x : y));
    }
}