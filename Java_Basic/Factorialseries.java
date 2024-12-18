import java.util.Scanner;

public class Factorialseries {
    public static void main(String[] args) {
        int n , i =1 ;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number value for the factorial ");
        n = sc.nextInt();
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("The factorail " + fact);
    }
}
