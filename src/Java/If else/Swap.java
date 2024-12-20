
//11)number swap (two ways )
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a ");
        a = sc.nextInt();
        System.out.println("Enter the numbers b ");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swapped numbers are :  a :  " + a + " b : " + b);
    }
}