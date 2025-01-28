import java.util.Scanner;

public class Ifelse4444 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers and an operator
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operator (+ for addition): ");
        char operator = scanner.next().charAt(0);  // Read the first character of input

        // Perform calculation based on operator
        if (operator == '+') {
            double result = a + b;
            System.out.println("Result: " + a + " + " + b + " = " + result);
        } else {
            System.out.println("Invalid operator. Only '+' is supported.");
        }

    }
}
