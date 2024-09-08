//EntryConditions
import java.util.Scanner;

public class EntryConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("People's entry under 16 is prohibited");
        } else {
            System.out.println("Welcome");

            System.out.println("Order price ");
            double order = scanner.nextDouble();
            order = 5000 + order;

            System.out.println("Are you VIP true/false ");
            boolean vip = scanner.hasNextBoolean();

            if (vip == true) {
                order *= 0.85;
                System.out.println("Your bill is "  + order);
            } else {
                System.out.println("No discount");
            }





        }


    }
}
