import java.util.Scanner;

public class Ifelse3333 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter 1 for Even Number or 2 for Odd Number: ");
        int numberType = scanner.nextInt();

        // Check the number type and print the corresponding message
        if (numberType == 1) {
            System.out.println("Even Number");
        } else if (numberType == 2) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Invalid input");
        }

    }
}
