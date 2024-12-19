// 5)five number max abcde
import java.util.Scanner;
public class Fivenummax {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a ");
        a = sc.nextInt();
        System.out.print("Enter the number b ");
        b = sc.nextInt();
        System.out.print("Enter the number c ");
        c = sc.nextInt();
        System.out.print("Enter the number d ");
        d = sc.nextInt();
        System.out.print("Enter the number e ");
        e = sc.nextInt();
        if (a>b && a>c && a>d && a>e) {
            System.out.println("a is max");
        } else if (b>a && b>c && b>d && b>e){
            System.out.println("b is max");
        } else if (c>a && c>b && c>d && c>e) {
            System.out.println("c is max");
        } else if (d>a && d>b && d>c && d>e) {
            System.out.println("d is max");
        } else if (e>a && e>b && e>c && e>d) {
            System.out.println("e is max");
        } else {
            System.out.println("Input not macthed");
        }
    }
}
