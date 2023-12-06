package ro.itschool.project.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExceptionHandling {

    public static void main(String[] args) {
        //try with resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by 0.");
            System.out.println("Exception message: " + exception.getMessage());
        } catch (InputMismatchException exception) {
            System.out.println("Please enter an integer.");
            System.out.println("Exception message: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Something went wrong.");
            System.out.println("Exception message: " + exception.getMessage());
        }
    }
}
