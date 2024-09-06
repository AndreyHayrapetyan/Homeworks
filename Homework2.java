
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first double ");
        double first_double = scanner.nextDouble();

        System.out.println("Enter second double ");
        double second_double = scanner.nextDouble();

        System.out.println("Enter third double ");
        double third_double = scanner.nextDouble();

        int sum =(int) (first_double + second_double + third_double);
        System.out.println("The sum is " + sum);
    }
}
