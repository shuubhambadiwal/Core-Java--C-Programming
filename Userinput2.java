// 2)
// user input :
// Performing Operations:
// Create two variables, num1 and num2, with values 10 and 5 respectively. 
// Perform addition, subtraction, multiplication, and division operations on them.

public class Userinput2 {
    public static void main(String[] args) {
        int num1, num2, sum, sub, mul, div;
        num1= 10;
        num2= 5;
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
