import java.util.Scanner;

public class Opr444 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a/b;
        System.out.println("The value of A divide by B is " + c);
    }
}