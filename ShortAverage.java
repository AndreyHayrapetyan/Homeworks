//ShortAverage
import java.util.Scanner;

public class ShortAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first short ");
        short a = scanner.nextShort();

        System.out.println("Enter the second short ");
        short b = scanner.nextShort();

        System.out.println("Enter the third short ");
        short c = scanner.nextShort();

        int sum = (a + b + c) / 3;

        int num1, num2, num3;

        num1 = a < 0 ? -a : a;
        num2 = b < 0 ? -b : b;
        num3 = c < 0 ? -c : c;

        int absolutesum = (num1 + num2 + num3) / sum;
        System.out.println("Average sum is "  + absolutesum );


    }
}
