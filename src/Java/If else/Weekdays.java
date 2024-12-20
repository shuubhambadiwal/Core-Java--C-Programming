//13)
//        number (WEEK DAYS)
//        1 =>sunday
//        2 =>monday
//        3 =>tuesday

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        day = sc.nextInt();
        if (day == 1) {
            System.out.println( "Monday");
        } else if (day == 2) {
            System.out.println( "Tuesday");
        } else if (day == 3) {
            System.out.println( "Wednesday");
        } else {
            System.out.println( "Invalid Day");
        }
    }
}