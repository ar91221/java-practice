public class ModernSwitch {
    public static void main(String[] args) {
        String day = "WEDNESDAY";
        
        // No fall-through with arrow syntax
        switch (day) {
            case "MONDAY" -> System.out.println("Start of work week ");
            case "TUESDAY", "WEDNESDAY", "THURSDAY" -> System.out.println("Mid week ");
            case "FRIDAY" -> System.out.println("TGIF! ");
            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend! ");
            default -> System.out.println("Invalid day");
        }
        
        // Switch as expression (returns value)
        int number = 2;
        String result = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Other";
        };
        System.out.println("Result: " + result);
        
        // Using yield for multiple statements
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> {
                System.out.println("Excellent!");
                yield "A";
            }
            case 8 -> {
                System.out.println("Good job!");
                yield "B";
            }
            case 7 -> {
                System.out.println("Satisfactory");
                yield "C";
            }
            default -> {
                System.out.println("Need improvement");
                yield "F";
            }
        };
        System.out.println("Grade: " + grade);
    }
}