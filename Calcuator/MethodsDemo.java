package Calcuator;

public class MethodsDemo {
    public static void main(String[] args) {
        try {
            Calculator addition = Operations::add;
            Calculator subtraction = Operations::subtract;
            Calculator multiplication = Operations::multiply;
            Calculator division = Operations::divide;

            System.out.println("Addition: " + addition.calculate(10, 4));
            System.out.println("Subtraction: " + subtraction.calculate(10, 10));
            System.out.println("Multiplication: " + multiplication.calculate(20, 5));
            System.out.println("Division: " + division.calculate(48, 12));
            System.out.println("Division by zero: " + division.calculate(5, 0));

        } catch (InvalidCalculationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
