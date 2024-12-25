import java.util.Scanner;

public class Ifelse8 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input 5 numbers
        System.out.print("Enter marks of 5 subjects (out of 100): ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();

        // Check if all marks are above 40
        boolean allAbove40 = mark1 > 40 && mark2 > 40 && mark3 > 40 && mark4 > 40 && mark5 > 40;

        // Calculate total and average
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        // Determine grade
        String grade;
        if (!allAbove40) {
            grade = "Fail";
        } else if (average >= 45 && average < 50) {
            grade = "D";
        } else if (average >= 50 && average < 60) {
            grade = "C";
        } else if (average >= 60 && average <= 80) {
            grade = "B";
        } else if (average > 80) {
            grade = "A";
        } else {
            grade = "Fail";
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Marks: " + mark1 + " " + mark2 + " " + mark3 + " " + mark4 + " " + mark5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}