import java.util.Scanner;

public class Evenoddposneg {
    public static void main(String[] args) {
        System.out.println("Enter the number value");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num<0) {
            System.out.println("The given number is negative");
            if (num%2==0) {
            System.out.println("The given number is Even");
            } else {
            System.out.println("The given number is odd");
            }
        } else if (num>0) {
            System.out.println("The given number is Positive");
            if (num%2==0) {
                System.out.println("The given number is Even");
                } else {
                System.out.println("The given number is odd");
                }
        }
    }
}
