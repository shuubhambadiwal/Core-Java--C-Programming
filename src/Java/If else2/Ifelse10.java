import java.util.Scanner;

public class Ifelse10 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee address:");
        String address = scanner.nextLine();

        System.out.println("Enter bank details:");
        String bankDetails = scanner.nextLine();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter number of holidays:");
        int holidays = scanner.nextInt();

        // Calculate salary after deductions
        double finalSalary;
        if (holidays == 1) {
            finalSalary = salary;
        } else if (holidays >= 2 && holidays <= 5) {
            finalSalary = salary - (salary * 0.05);
        } else if (holidays >= 6 && holidays <= 14) {
            finalSalary = salary - (salary * 0.10);
        } else if (holidays == 15) {
            finalSalary = salary * 0.50;
        } else {
            finalSalary = 0;
        }

        // Display results
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Bank Details: " + bankDetails);
        System.out.println("Salary: " + salary);
        System.out.println("Final Salary after deductions: " + finalSalary);
        System.out.println("Number of Holidays: " + holidays);

    }
}