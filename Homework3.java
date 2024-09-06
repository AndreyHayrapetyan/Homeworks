
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first double ");
        double first_double = scanner.nextDouble();

        System.out.println("Enter second double ");
        double second_double = scanner.nextDouble();

        System.out.println("Enter third double ");
        double third_double = scanner.nextDouble();

        double sum = first_double + second_double + third_double;
        double decimalPart = sum - (int) sum;
        System.out.println("Sum decimal part is " + decimalPart);
    }
}
