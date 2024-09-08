import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int number = scanner.nextInt();

        if (number > 999 && number < 10000 ) {
            processData(number);
        } else {
            System.exit(0);
        }

        System.out.println(number);
        System.out.println(number / 1000);
        System.out.println(number % 1000 / 100);
        System.out.println(number % 100 / 10);
        System.out.println(number % 10);


    }

    public static void processData(int number) {
        System.out.println("Processing data " + number);
    }
}