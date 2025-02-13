package Calcuator;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator addition = (a, b) -> a + b;
            Calculator subtraction = (a, b) -> a - b;
            Calculator multiplication = (a, b) -> a * b;
            Calculator division = (a, b) -> {
                if (b == 0) {
                    throw new InvalidCalculationException("Cannot divide by zero");
                }
                return a / b;
            };

            System.out.println("Addition: " + addition.calculate(25, 5));
            System.out.println("Subtraction: " + subtraction.calculate(50, 10));
            System.out.println("Multiplication: " + multiplication.calculate(5, 12));
            System.out.println("Division: " + division.calculate(10, 2));
            System.out.println("Division by zero: " + division.calculate(10, 0));

        } catch (InvalidCalculationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
