// 6) user 
// -9 negative integer 
// 5 positive integer 
// 0 =zero 
import java.util.Scanner;

public class Numcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num = sc.nextInt();
        if (num>0){
            System.out.print("Positive Integer ");
        } else if (num<0) {
            System.out.print("Negative Integer ");
        } else if (num==0) {
            System.out.print("Zero ");
        }
    } 
}
