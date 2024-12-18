// 6)
// Leap Year:
// Create a Java program to determine if a given year is a leap year.

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter the Days for the checking the leap year");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is an Leap Year");
        }else {
            System.out.println("The year is not the Leap year");
        }
    }
}
