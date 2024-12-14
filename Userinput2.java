// 2)
// user input :
// Performing Operations:
// Create two variables, num1 and num2, with values 10 and 5 respectively. 
// Perform addition, subtraction, multiplication, and division operations on them.

import java.util.Scanner;

public class Userinput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum, sub, mul, div;
        System.out.print("The number 1 value is ");
        num1= sc.nextInt();
        System.out.print("The number 2 value is ");
        num2= sc.nextInt();
        // Addition
        sum = num1 + num2;
        // Subtraction
        sub = num1 - num2;
        // Multiplication
        mul = num1 * num2;
        // Division
        div = num1 / num2;
        System.out.println("The sum of num1 and num2 is " + sum);
        System.out.println("The subraction of num1 and num2 is " + sub);
        System.out.println("The multiplication of num1 and num2 is " + mul);
        System.out.println("The division of num1 and num2 is " + div);
    }
}
