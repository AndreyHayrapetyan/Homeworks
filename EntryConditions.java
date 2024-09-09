//EntryConditions
import java.util.Scanner;

public class EntryConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("People's entry under 16 is prohibited");
            System.exit(1);
        } else {
            System.out.println("Welcome");

            System.out.println("Are you VIP true/false ");
            boolean vip = scanner.nextBoolean();

            if (vip) {
                System.out.println("Enter your order price");
                double vipprice = scanner.nextDouble();
                vipprice *= 0.85;
                System.out.println("Your price is " + vipprice);
            } else {
                System.out.println("Enter your order price");
                double price = scanner.nextDouble();
                price = 5000 + price;
                System.out.println("Your price is " + price);
            }
        }
    }
}
