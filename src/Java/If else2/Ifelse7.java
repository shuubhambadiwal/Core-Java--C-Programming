//7) Write a java program to read the roll no, name, fnname and marks of three subjects and calculate the total, percentage and division.
// Test Data :
// Input the Roll Number of the student :784
// student name :
// fname:
// mname:
// address:
// contact:
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90
// total:
// precentage : %
// division:

import java.util.Scanner;

public class Ifelse7 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Input the Roll Number of the student: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Father's name: ");
        String fname = scanner.nextLine();

        System.out.print("Mother's name: ");
        String mname = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Contact: ");
        String contact = scanner.nextLine();

        // Input marks for three subjects
        System.out.print("Input the marks of Physics, Chemistry and Computer Application: ");
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int computer = scanner.nextInt();

        // Calculate total, percentage, and division
        int total = physics + chemistry + computer;
        float percentage = total / 3.0f;

        String division;
        if (percentage >= 60) {
            division = "First";
        } else if (percentage >= 50) {
            division = "Second";
        } else if (percentage >= 40) {
            division = "Third";
        } else {
            division = "Fail";
        }

        // Display results
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fname);
        System.out.println("Mother's Name: " + mname);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);

        System.out.println("\n--- Marks and Results ---");
        System.out.println("Marks in Physics: " + physics);
        System.out.println("Marks in Chemistry: " + chemistry);
        System.out.println("Marks in Computer Application: " + computer);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Division: " + division);

    }
}













