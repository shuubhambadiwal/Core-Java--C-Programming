// 3)two number max a b 
// a ya b dono mey se bda konsa hey 
import java.util.Scanner;

public class AorBisbig {
    public static void main(String[] args){
        int big, big2;
        System.out.print("Enter the number a");
        Scanner sc = new Scanner(System.in);
        big = sc.nextInt();
        System.out.print("Enter the number b");
        big2 = sc.nextInt();
        if (big == big2) {
            System.out.println("Number a and b are equal");
        } else if (big>big2) {
            System.out.println("Number a is grater than number b");
        } else if (big2>big) {
            System.out.println("Number b is grater than number a");
        } else {
            System.out.println("Input not matched");
        } 
    }
}
