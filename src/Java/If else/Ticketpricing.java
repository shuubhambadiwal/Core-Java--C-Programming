import java.util.Scanner;

public class Ticketpricing {
    public static void main(String[] args) {
        System.out.print("Enter the age Child  ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num>=1 && num<=17) {
            int price = 1000;
            System.out.println("The Ticket price will be " + price);
        } else if (num>=18 && num<=50) {
            int price = 2000;
            System.out.println("The Ticket price will be " + price);
        } else if (num>=50 && num<=101) {
            int price = 3000;
            System.out.println("The Ticket price will be " + price);
        }
    }
}
