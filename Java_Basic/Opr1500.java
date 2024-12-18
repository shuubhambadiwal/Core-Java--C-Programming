import java.util.Scanner;

public class Opr1500 {
    public static void main(String[] args) {
        float a,b,c,d,e,v;
        int f,g; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        e = sc.nextFloat();
        f = sc.nextInt();
        g = sc.nextInt();
        v = a*b-(c-d)+e-f+g;
        System.out.println("The Result of this expn is " + v);
    }
}
