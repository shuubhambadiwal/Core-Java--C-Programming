// 1)
// User input :
// Declare and Initialize Variables:
// Declare an integer variable named age and initialize it with the value 25.
// Declare a double variable named price and initialize it with the value 19.99.

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int aged;
       double price;
       System.out.print("Enter the value of Age");
       aged = sc.nextInt();
       System.out.print("Enter the value of price");
       price = sc.nextInt();
       System.out.println("Age " + aged);
       System.out.println("Price " + price);
    }
}