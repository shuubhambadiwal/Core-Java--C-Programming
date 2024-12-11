//1.6*(12-2)/2+7.8-1.5  
import java.util.Scanner;

public class Opr1100 {
    public static void main(String[] args) {
        int d , e;
        float a, b, c , v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextInt();
        e = sc.nextInt();
        v = a*(d-e)/e+b-c;
        System.out.println("The Result of the above expresion is " + v);
    }
}