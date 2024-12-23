//5) Java program to enter student marks and find percentage and grade
// A college has the following rules for the grading system:
// 5 marks (grade + %)
// 1. Below 25 – F
// 2. 25 to 45 – E
// 3. 45 to 50 – D
// 4. 50 to 60 – C
// 5. 60 to 80 – B
// 6. Above 80 – A

import java.util.Scanner;
public class Ifelse5{
    public static void main(String[] args) {
        int marks;
        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if (marks < 25) {
            System.out.println("F");
        } else if (marks >= 25 && marks < 45) {
            System.out.println("E");
        } else if (marks >= 45 && marks < 50) {
            System.out.println("D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        // Percentage calculator
        double percentage = marks * 100 / 500;
        System.out.println("Percentage: " + percentage);
    }
}




