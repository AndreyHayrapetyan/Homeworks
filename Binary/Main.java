package Binary;

public class Main {
    public static void main(String[] args) {
        try {
            int number = 15;
            String binary = toBinary(number);
            System.out.println("The binary representation of " + number + " is: " + binary);
        } catch (NegativeNumbersException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String toBinary(int number) throws NegativeNumbersException {
        if (number < 0) {
            throw new NegativeNumbersException("Negative numbers are not allowed.");
        }
        return number == 0 ? "0" : number == 1 ? "1" : toBinary(number / 2) + (number % 2);
    }
}
