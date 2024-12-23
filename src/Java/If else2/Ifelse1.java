//1)Java program to find out whether a given year is a leap year or not:

import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year ");
           } else {
                    System.out.println("The year is not a leap year ");
           }
        }
}