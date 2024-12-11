// 3.4+1.2*(3.7-1.2)/2+6.8

import java.util.Scanner;

public class Opr1400 {
    public static void main(String[] args) {
        float a,b,c,d,f,v;
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        f = sc.nextFloat();
        e = sc.nextInt();
        v = a + b * ( c - d ) / e + f;
        System.out.println("The Result of the expn is " + v);
    }
}
