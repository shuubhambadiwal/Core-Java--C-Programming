//1.2*6.7-4.5/2 

import java.util.Scanner;

public class Opr1000 {
    public static void main(String[] args) {
        float a, b, c , d, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        v = a*b-c/d;
        System.out.println("The Sum of expn is " + v);
    }
}