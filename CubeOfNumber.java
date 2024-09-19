import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number ");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            int b = i * i * i;
            if (b == n){
                System.out.println("The cube of " + i + " is " + n  );
                break;
            } else if (b > n) {
                System.out.println(n + " isn't cube of any number ");
                break;
            }
        }
    }
}