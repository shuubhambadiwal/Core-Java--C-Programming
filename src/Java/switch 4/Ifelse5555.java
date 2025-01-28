import java.util.Scanner;

public class Ifelse5555 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Ask the user to enter their voter ID status (v for valid, any other key for invalid)
        System.out.print("Enter 'v' to check if voter ID is valid: ");
        char voterID = scanner.next().charAt(0); // Read the first character

        // Check if the person is eligible to vote
        if (age >= 18 && voterID == 'v') {
            System.out.println("You are eligible to vote.");
        } else if (age < 18) {
            System.out.println("You are not eligible to vote due to age.");
        } else {
            System.out.println("Your voter ID is invalid.");
        }
    }
}
