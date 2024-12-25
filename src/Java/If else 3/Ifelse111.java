import java.util.Scanner;

public class Ifelse111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income
        System.out.print("Enter your income:");
        double income = scanner.nextDouble();

        double tax;

        // Calculate tax based on income brackets
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 50000) {
            tax = (20000 * 0.10) + (income - 30000) * 0.20;
        } else {
            tax = (20000 * 0.10) + (20000 * 0.20) + (income - 50000) * 0.30;
        }

        // Display results
        System.out.println("\n--- Tax Details ---");
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);

    }
}
