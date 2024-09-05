
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lowercase letter ");
        char lowercase = scanner.next().charAt(0);
        System.out.println("Letter in upper case: " + (char) ((int) lowercase - 32));
    }
}
