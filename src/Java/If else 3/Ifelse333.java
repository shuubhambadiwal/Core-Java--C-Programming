import java.util.Scanner;

public class Ifelse333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        // Check if it's a leap year
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Display result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}