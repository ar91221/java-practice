import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO JAVA MART ===");
        
        // Get customer info
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        // Item 1
        System.out.print("\nEnter item 1 name: ");
        String item1Name = scanner.nextLine();
        System.out.print("Enter price of " + item1Name + ": $");
        double item1Price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int item1Qty = scanner.nextInt();
        
        // Item 2
        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter item 2 name: ");
        String item2Name = scanner.nextLine();
        System.out.print("Enter price of " + item2Name + ": $");
        double item2Price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int item2Qty = scanner.nextInt();
        
        // Calculate totals
        double item1Total = item1Price * item1Qty;
        double item2Total = item2Price * item2Qty;
        double subtotal = item1Total + item2Total;
        double tax = subtotal * 0.10;  // 10% tax
        double total = subtotal + tax;
        
        // Display receipt
        System.out.println("\n=== RECEIPT ===");
        System.out.println("Customer: " + customerName);
        System.out.println("\nItems purchased:");
        System.out.printf("%-15s %8s %8s %10s%n", "Item", "Qty", "Price", "Total");
        System.out.println("------------------------------------------------");
        System.out.printf("%-15s %8d $%7.2f $%9.2f%n", item1Name, item1Qty, item1Price, item1Total);
        System.out.printf("%-15s %8d $%7.2f $%9.2f%n", item2Name, item2Qty, item2Price, item2Total);
        System.out.println("------------------------------------------------");
        System.out.printf("%-30s $%9.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-30s $%9.2f%n", "Tax (10%):", tax);
        System.out.printf("%-30s $%9.2f%n", "TOTAL:", total);
        
        scanner.close();
    }
}