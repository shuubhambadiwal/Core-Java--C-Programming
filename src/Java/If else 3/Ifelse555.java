import java.util.Scanner;

public class Ifelse555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Welcome to the Restaurant!");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("Please enter your choice (1-3):");

        // Input customer's choice
        int choice = scanner.nextInt();

        // Display selected item and price
        if (choice == 1) {
            System.out.println("You selected Burger. Price: $5.99");
        } else if (choice == 2) {
            System.out.println("You selected Pizza. Price: $8.99");
        } else if (choice == 3) {
            System.out.println("You selected Salad. Price: $4.99");
        } else {
            System.out.println("Invalid choice. Please select a valid option (1-3).");
        }

    }
}