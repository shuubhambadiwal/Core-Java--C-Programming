import java.util.Scanner;

public class Ifesle888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ticket price and customer's age
        System.out.println("Enter the standard ticket price:");
        double ticketPrice = scanner.nextDouble();

        System.out.println("Enter the customer's age:");
        int age = scanner.nextInt();

        double finalPrice;

        // Calculate final price based on age
        if (age < 12) {
            finalPrice = ticketPrice * 0.50; // 50% discount for children
        } else if (age >= 65) {
            finalPrice = ticketPrice * 0.70; // 30% discount for seniors
        } else {
            finalPrice = ticketPrice; // No discount
        }

        // Display the final ticket price
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Standard Ticket Price: $" + ticketPrice);
        System.out.println("Customer Age: " + age);
        System.out.println("Final Ticket Price: $" + finalPrice);

    }
}