// 4)Three number max a b c 
// tenno mey se konsa badha hey 

import java.util.Scanner;

public class Biginthree {
    public static void main(String[] args) {
        int a , b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a");
        a = sc.nextInt();
        System.out.print("Enter the number b");
        b = sc.nextInt();
        System.out.print("Enter the number c");
        c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("The a is maximum");
        } else if (b>a && b>c) {
            System.out.println("the b is maximum");
        } else if (c>a && c>b) {
            System.out.println("The c is maximum");
        } else {
            System.out.println("Input not matched");
        }
    }
}
