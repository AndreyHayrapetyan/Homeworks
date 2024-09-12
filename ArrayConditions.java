import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a positive number ");
        int n = scanner.nextInt();
        int a;

        switch (n) {
            case 3:
                a = 3;
                break;
            case 4:
                a = 4;
                break;
            case 5:
                a = 5;
                break;
            case 6, 7:
                a = 10;
                break;
            default:
                a = 15;
                System.out.println();
                break;
        }
        int[] b = new int[a];
        b[0] = 15 * (a / 15);

        switch (a) {
            case 3:
                System.out.println(Arrays.toString(b));
                break;
            case 4:
                System.out.println(Arrays.toString(b));
                break;
            case 5:
                System.out.println(Arrays.toString(b));
                break;
            case 6 , 7:
                System.out.println(Arrays.toString(b));
                break;
            default:
                System.out.println(Arrays.toString(b));
                break;
        }
    }
}
