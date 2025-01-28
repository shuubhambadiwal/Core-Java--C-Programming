import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();

        // Input appraisal rating
        System.out.println("Enter the Performance appraisal rating");
        double rating = scanner.nextDouble();

        // Validate inputs
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } else {
            // Calculate increment based on appraisal rating
            double incrementPercentage = 0;

            if (rating >= 1 && rating <= 3) {
                incrementPercentage = 10;
            } else if (rating > 3 && rating <= 4) {
                incrementPercentage = 25;
            } else if (rating > 4 && rating <= 5) {
                incrementPercentage = 30;
            }

            // Calculate and display the incremented salary
            double incrementedSalary = salary + (salary * incrementPercentage / 100);
            System.out.println((int) incrementedSalary); // Display as an integer
        }

        scanner.close();
    }
}
