//Homework
import java.util.Scanner;
public class ChangedHomework1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a digit");
        int number = scanner.nextInt();

        System.out.println(number);
        System.out.println(number / 1000);
        System.out.println(number % 1000 / 100);
        System.out.println(number % 100 / 10);
        System.out.println(number % 10);

    }
}
