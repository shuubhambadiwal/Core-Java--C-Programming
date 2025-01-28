import java.util.Scanner;

public class Ifelse2222 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter gender
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0); // Read the first character of the input

        // Use switch statement to print corresponding gender
        switch (Character.toUpperCase(gender)) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
