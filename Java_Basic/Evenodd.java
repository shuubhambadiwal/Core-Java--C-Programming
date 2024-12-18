// 5)
// Even or Odd:
// Write a Java program to check if a given number is even or odd.

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num = sc.nextInt();
        if(num%2==0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is Odd");
        }
    }
}
