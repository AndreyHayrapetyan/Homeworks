import java.util.Scanner;
public class ArrayElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        if (n <= 0 ) {
            System.out.println("Invalid range");
            System.exit(1);
        }

        System.out.println("Enter numbers for array ");

        for (int i = 0; i<n; i++ ) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter starting index");
        int a = scanner.nextInt();
        System.out.println("Enter the last index ");
        int b = scanner.nextInt();

        if (a < 0 || b < a  ){
            System.out.println("Invalid index");
            System.exit(2);
        }

        int[] array2 = new int[b - a + 1];

        for (int i = a, d = 0; i <= b; i++, d++) {
            array2[d] = array[i];
        }

        System.out.println("Second array's numbers are ");

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}