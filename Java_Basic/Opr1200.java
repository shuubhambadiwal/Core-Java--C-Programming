// 4.5*1.2-(82/2)-5.6 +1.234 

import java.util.Scanner;

public class Opr1200 {
    public static void main(String[] args) {
        float a,b,c;
        double d,v;
        int e,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextDouble();
        e = sc.nextInt();
        f = sc.nextInt();
        v = a*b-(e/f)-c+d;
        System.out.println("The resultant of the above expsn is " + v);
    }
}