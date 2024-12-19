import java.util.Scanner;

public class Opr1300 {
    public static void main(String[] args) {
        int a, b, c, d , e, f, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        h = a*b+(c-d)/e+f;
        System.out.println("The Result of the expsn is " + h);
    }
}
