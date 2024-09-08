//ChangedHomework4
import java.util.Scanner;

public class ChangedHomework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstinteger = scanner.nextInt();

        System.out.println("Enter second integer");
        int secondinteger = scanner.nextInt();

        if (firstinteger % secondinteger == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
