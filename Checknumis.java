// 7)
// Positive, Negative, or Zero:
// Create a Java program to check if a given number is positive, negative, or zero.

import java.util.Scanner;

public class Checknumis {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num==0) {
            System.out.println("The given number is Zero");
        } else if (num>0) {
            System.out.println("The given number is positive");
        } else if (num<0) {
            System.out.println("The given number is negative");
        }
    }
}
