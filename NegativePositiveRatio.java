//Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։
// Ձեր խնդիրնա գտնել մեթոդին փոխանցված array-ում
// դրական ու բացասական թվերի հարաբերակցությունը` positive / negative,
// ու վերադարձնել տվյալ double թիվը։ Եթե չլինեն բացասական թվեր, թող վերադարձնի -1։
import java.util.Scanner;

public class NegativePositiveRatio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array's elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        double result = getResult(array);
        System.out.println(result);

    }
    static double getResult(int[] arr) {
        int negative = 0;
        int positive = 0;
        for(int i : arr) {
            if (i < 0){
                negative++;
            } else if (i > 0){
                positive++;
            }
        }
        if(negative == 0) {
            return -1;
        }
        return (double) positive / negative;
    }
}