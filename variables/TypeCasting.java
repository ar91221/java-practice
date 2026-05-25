public class TypeCasting {
    public static void main(String[] args) {
        
        // IMPLICIT CASTING (Automatic, safe)
        // byte → short → int → long → float → double
        int myInt = 100;
        long myLong = myInt;     // Automatically converts
        double myDouble = myInt; // Automatically converts
        System.out.println("Int to double: " + myDouble); // 100.0
        
        // EXPLICIT CASTING (Manual, may lose data)
        double salary = 50000.75;
        int roundedSalary = (int) salary;  // (int) tells Java to convert
        System.out.println("Original: " + salary);     // 50000.75
        System.out.println("Rounded: " + roundedSalary); // 50000 (lost .75!)
        
        // Losing data example
        int largeNumber = 130;
        byte smallNumber = (byte) largeNumber;
        System.out.println("130 as byte: " + smallNumber); // -126 (overflow!)
        
        // char to int (ASCII values)
        char letter = 'A';
        int asciiCode = letter;
        System.out.println("ASCII of 'A': " + asciiCode); // 65
    }
}