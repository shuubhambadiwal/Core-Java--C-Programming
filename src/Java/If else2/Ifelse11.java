import java.util.Scanner;

public class Ifelse11 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input user details
        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter the number of units consumed:");
        int units = scanner.nextInt();

        // Calculate amount and discount
        double amount;
        double discountRate;

        if (units >= 1 && units <= 10) {
            amount = units * 4;
            discountRate = 0.10;
        } else if (units >= 11 && units <= 20) {
            amount = units * 4;
            discountRate = 0.15;
        } else if (units >= 21 && units <= 40) {
            amount = units * 4;
            discountRate = 0.30;
        } else if (units >= 50) {
            amount = units * 4;
            discountRate = 0.50;
        } else {
            amount = units * 4;
            discountRate = 0.0;
        }

        double discount = amount * discountRate;
        double totalPayAmount = amount - discount;

        // Display results
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Total Payable Amount: " + totalPayAmount);

    }
}