import java.util.Scanner;

public class Ifelse12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Retailer Details
        System.out.println("Enter retailer name:");
        String retailerName = scanner.nextLine();

        System.out.println("Enter the number of pieces sold:");
        int pieces = scanner.nextInt();

        double retailerDiscountRate;

        if (pieces >= 1 && pieces <= 15) {
            retailerDiscountRate = 0.15;
        } else if (pieces >= 16 && pieces <= 30) {
            retailerDiscountRate = 0.30;
        } else if (pieces >= 31 && pieces <= 50) {
            retailerDiscountRate = 0.50;
        } else {
            retailerDiscountRate = 0.0;
        }

        System.out.println("\n--- Retailer Details ---");
        System.out.println("Retailer Name: " + retailerName);
        System.out.println("Pieces Sold: " + pieces);
        System.out.println("Discount Rate: " + (retailerDiscountRate * 100) + "%");

        // Customer Details
        System.out.println("\nEnter customer name:");
        scanner.nextLine(); // Consume newline
        String customerName = scanner.nextLine();

        System.out.println("Enter contact number:");
        String contactNumber = scanner.nextLine();

        System.out.println("Enter payment amount:");
        double payment = scanner.nextDouble();

        double customerDiscountRate;

        if (payment >= 100 && payment <= 1000) {
            customerDiscountRate = 0.05;
        } else if (payment > 1000 && payment <= 2000) {
            customerDiscountRate = 0.10;
        } else if (payment > 2000 && payment <= 3000) {
            customerDiscountRate = 0.15;
        } else if (payment > 3000) {
            customerDiscountRate = 0.30;
        } else {
            customerDiscountRate = 0.0;
        }

        double customerDiscount = payment * customerDiscountRate;
        double totalPayment = payment - customerDiscount;

        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Payment Amount: " + payment);
        System.out.println("Discount Rate: " + (customerDiscountRate * 100) + "%");
        System.out.println("Total Payment After Discount: " + totalPayment);

    }
}
