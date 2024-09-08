//Triangle
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side of triangle");
        int a = scanner.nextInt();

        System.out.println("Enter second side of triangle");
        int b = scanner.nextInt();

        System.out.println("Enter third side of triangle");
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a ) && a > 0 && b > 0 && c > 0) {
            System.out.println("The triangle is formed with following lenghts " + a + "," + b + "," + c + "."  );
        } else {
            System.out.println("Triangle cannot be formed with following lenghts " + a + "," + b + "," + c + "." );
        }

    }
}
