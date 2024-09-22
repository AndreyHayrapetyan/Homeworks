//Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։
// Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի
// անկյունագծերի վրայի թվերի գումարը։
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of rows");
        int row = scanner.nextInt();
        System.out.println("Enter the columns of matrix");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        int element = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = element;
                element++;
            }
            element = 1;
        }

        System.out.println("Your matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][i];
        }


        System.out.println(sum);
    }
}
