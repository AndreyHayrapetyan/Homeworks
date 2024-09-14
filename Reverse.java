import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        double[] original = {4.5 , -6.7 , 7.4 , 2.5 , -5.9};

        double[] reversed = {0, 0, 0, 0, 0};

        int a = 4;

        if (original[0] >= 0) {
            reversed[a] = original[0];
            a--;
        }
        if (original[1] >= 0) {
            reversed[a] = original[1];
            a--;
        }
        if (original[2] >= 0) {
            reversed[a]=original[2];
            a--;
        }
        if (original[3] >= 0) {
            reversed[a] = original[3];
            a--;
        }
        if (original[4] >= 0) {
            reversed[a] = original[4];
        }
        System.out.println("Original array is " + Arrays.toString(original));
        System.out.println("Reversed array is " + Arrays.toString(reversed));
    }
}
