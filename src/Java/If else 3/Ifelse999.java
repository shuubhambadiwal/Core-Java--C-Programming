import java.util.Scanner;

public class Ifelse999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's score
        System.out.println("Enter the student's score (0-100):");
        int score = scanner.nextInt();

        String grade;

        // Determine the letter grade
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the grade
        System.out.println("\n--- Grade Details ---");
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}