import java.util.Arrays;
import java.util.Scanner;

public class MidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 and 8 ");
        int n = scanner.nextInt();
        System.out.println("Enter the first number ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number ");
        int b = scanner.nextInt();

        if (n <= 0 || n > 8) {
            System.out.println("The number should be between 1 and 8");
            System.exit(1);
        }

        int[] array = new int[n];

        int mid = n / 2;
        array[mid - 1] = a < b ? a : b;
        array[mid + 1] = a < b ? b : a;



        System.out.println(Arrays.toString(array));


    }
}
