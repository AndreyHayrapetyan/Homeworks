//Մի հատ էլ պարզ խնդիր. պիտի գրեք մեթոդ,
// որը կստանաս ամբողջ թվերի array ու ևս մեկ՝
// array-ի տիպն ունեցող պարամետր։ Ձեր մեթոդը
// պետքա վերադարձնի true, եթե էդ թիվը պարունակվումա
// array-ի մեջ, ու false, եթե չի պարունակվում։
import java.util.Scanner;

public class NumberContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
        System.out.println("Enter an number");
        int number = scanner.nextInt();

        boolean contain = result(array, number);
        System.out.println(contain);

    }
    static boolean result(int[] arr, int num) {
        for(int i = 0; i< arr.length; i++ ){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}