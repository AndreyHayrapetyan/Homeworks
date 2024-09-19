import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a positive number ");
            n = scanner.nextInt();
        } while (n <= 0);

        int a = 1;

        while (n / a >= 10) {
            a *= 10;
        }
        while (a > 0) {
            System.out.println(n / a);
            n %= a;
            a /= 10;
        }
    }
}

