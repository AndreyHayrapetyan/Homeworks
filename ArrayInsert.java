import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array");
        do {
            n = scanner.nextInt();
        } while (n < 1);
        int[] array = new int[n];
        int[] array2;

        System.out.println("Enter array's elements ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int size = n;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                size++;
            }
        }
        array2 = new int[size];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            array2[j] = array[i];
            j++;
            if (array[i] < 0) {
                array2[j] = i ;
                j++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");

        }
    }
}