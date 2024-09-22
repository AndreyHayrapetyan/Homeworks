import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array's size ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];

        for ( int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }
}