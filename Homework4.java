
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first double");
        double firstdouble = scanner.nextDouble();

        System.out.println("Enter second double");
        double seconddouble = scanner.nextDouble();

        System.out.println("Enter third double");
        double thirddouble = scanner.nextDouble();

        double sum = (int) firstdouble + (int) seconddouble + (int) thirddouble;
        System.out.println("The sum is" + sum);

    }
}
