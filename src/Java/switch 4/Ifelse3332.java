import java.util.Scanner;

public class Ifelse3332 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 'e' for even or 'o' for odd
        System.out.print("Enter 'e' for Even Number or 'o' for Odd Number: ");
        char input = scanner.next().charAt(0); // Read the first character of input

        // Check if the input is 'e' or 'o' and print the corresponding message
        if (input == 'e' || input == 'E') {
            System.out.println("Even Number");
        } else if (input == 'o' || input == 'O') {
            System.out.println("Odd Number");
        } else {
            System.out.println("Invalid input");
        }

    }
}