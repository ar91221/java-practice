import java.util.Scanner;

public class ZeroToFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = 0;
        int place = 1;
        
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                rem = 5;
            }
            result = result + rem * place;
            place *= 10;
            num /= 10;
        }
        
        System.out.println(result);
        scanner.close();
    }
}