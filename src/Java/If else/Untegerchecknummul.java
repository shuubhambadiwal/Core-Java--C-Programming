//10) If the inputs is the integer then check ,check number 7 or 3 k multiple se divisible hey kya
import java.util.Scanner;

public class Untegerchecknummul {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        num = sc.nextInt();
        if (num == (int) num) {
            System.out.println("The number is integer");
            if (num%7==0 || num%3==0) {
                System.out.println("The number is divisible by 7 or 3");
            } else {
                System.out.println("The number is not divisible by 7 or 3");
            }
        } else {
            System.out.println("The number is not integer");
        }
    }
}


