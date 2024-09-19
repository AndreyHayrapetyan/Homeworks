import java.util.Scanner;

public class DoubleArrayIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array's size ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        double sum = 0;

        System.out.println("Enter array's elements");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n;) {
            sum += array[i];

            if (array[i] > 0) {
                i++;
            } else if (array[i] < 0){
                i += 2;
            } else if(array[i] == 0){
                break;
            }
        }
        System.out.println("The sum is " + sum);
    }
}

