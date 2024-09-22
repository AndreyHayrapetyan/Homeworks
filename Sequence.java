import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        int max = 1;
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                len++;
            } else {
                if (len > max) {
                    max = len;
                }
                len = 1;
            }
        }


        if (len > max) {
            max = len;
        }

        System.out.println("The length of the longest sequence is  " + max);
    }
}
