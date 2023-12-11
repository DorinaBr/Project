package ro.itschool.project.services;

public class Calculator {

    double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(("Division by 0 is not allowed."));
        }
        return a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
