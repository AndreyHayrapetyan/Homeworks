package Calcuator;

public class Operations {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws InvalidCalculationException {
        if (b == 0) {
            throw new InvalidCalculationException("Cannot divide by zero");
        }
        return a / b;
    }
}
