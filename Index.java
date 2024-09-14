import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Print an index");
        int a = scanner.nextInt();

        if (a < 0 || a + 3 >= n) {
            System.out.println("Out of bounds");
            System.exit(1);
        }

        array[a] = a;
        array[a + 1] = a + 1;
        array[a + 2] = a + 2;
        array[a + 3] = a + 3;

        System.out.println(Arrays.toString(array));
    }
}
