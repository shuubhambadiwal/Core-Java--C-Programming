import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rem,sum=0;
        System.out.print("Enter the number");
        n = sc.nextInt();
        int temp=n;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }//n=0 
        if (temp == sum) {
            System.out.println("The number is panlindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
        System.out.println();
    }
}
