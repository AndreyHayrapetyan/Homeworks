//Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր.
// հեշտության համար array-ը ուղիղ հայտարարեք ու ինիցալիզացրեք կոդի մեջ։
// Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի
// պարզ լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։
// Յուրաքանչյուր անդամի պարզ լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։
// Նորից եմ շեշտում, յուրաքանչյուր թվի ստուգելը պետքա լինի առանձին մեթոդով,
// ոչ թե ամբողջ array-ինը։ Ձեր մեթոդը պետքա վերադարձնի սխալա թե ճիշտ, որ array-ի
// հերթական թիվը պարզա։
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(index(0));
        System.out.println(index(1));
        System.out.println(index(2));
        System.out.println(index(3));
        System.out.println(index(4));
        System.out.println(index(5));
        System.out.println(index(6));

    }

    static boolean index(int number) {
        int count = 0;
        int[] arr = {2, 3, 4, 17, 19, 22, 32};
        for (int i = 1; i <= arr[number]; i++) {
            if (arr[number] % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}