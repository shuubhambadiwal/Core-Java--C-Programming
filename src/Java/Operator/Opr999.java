import java.util.Scanner;

public class Opr999 {
    public static void main(String[] args) {
        int a , b , c , d , e, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        v = a * b + c / d - e;
        System.out.println("The Res of expn is " + v);
    }
}
