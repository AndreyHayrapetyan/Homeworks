package Calcuator;

@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b) throws InvalidCalculationException;
}
