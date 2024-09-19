import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n = scanner.nextInt();
        System.out.println("Enter the size of array 2");
        int size = scanner.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[size];


        if (n <= 0 || size <= 1 || size > n) {
            System.out.println("The array cannot be created ");
            System.exit(1);
        }

        System.out.println("Enter numbers for array 1 ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter numbers for array 2");

        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        int cout = 0;
        int j = 0;
        for (int i = 0; i < n && j < size; i++) {
            if (array[i] == array2[j]) {
                j++;
                cout++;
                i = 0;
            }
        }
        if (cout < size) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}