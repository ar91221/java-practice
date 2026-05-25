public class DataTypeExamples {
    public static void main(String[] args) {
        
        // Integers
        byte temperature = 25;
        short year = 2024;
        int population = 85000000;  // No commas!
        long worldPopulation = 8000000000L;  // Notice 'L' at end
        
        // Decimals
        float price = 19.99f;  // Notice 'f' at end
        double pi = 3.14159265359;  // No suffix needed
        
        // Character (single quotes!)
        char grade = 'A';
        char currencySymbol = '$';
        
        
        // Boolean (true/false, lowercase!)
        boolean isJavaFun = true;
        boolean isRaining = false;
        
        // String (double quotes!)
        String message = "Hello Java!";
        
        // Printing everything
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Price: $" + price);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Java is fun: " + isJavaFun);
        System.out.println(message);
    }
}