import java.util.Scanner;

public class TicketReserveation {
    public static void main(String[] args) {
        System.out.print("Enter the Age ");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if (age>=9) {
            int seat;
            int avaseat = 5;
            System.out.print("Enter the how much seat want to book");
            seat = sc.nextInt(); 
            if (seat<=avaseat) {
                System.out.println("Seat Book" + seat);
            } else {
                System.out.println("The Seats are already book");
            }
        } else {
            System.out.println("You are under age! No Access");
        }
    }
}
