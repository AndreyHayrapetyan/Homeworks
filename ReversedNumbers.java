import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = scanner.nextInt();

        int digit1 = (a % 10 );
        int digit2 =((a % 100) / 10);
        int digit3 = (a / 100);

        if (a < 0 || digit1 == 0) {
            System.out.println("Invalid number");
            System.exit(0);
        } else {
            System.out.println("Reversed number is " + digit1 + digit2 + digit3);
        }

    }
}
