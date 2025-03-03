import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of ticket:");
        int tickets = scanner.nextInt();

        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshment (y/n):");
        char refreshment = scanner.next().charAt(0);

        System.out.print("Do you have coupon code (y/n):");
        char coupon = scanner.next().charAt(0);

        System.out.print("Enter the circle (k/q):");
        char circle = scanner.next().charAt(0);

        scanner.close();

        int ticketCost;
        if (circle == 'k') {
            ticketCost = 75;
        } else if (circle == 'q') {
            ticketCost = 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        double totalCost = tickets * ticketCost;

        if (tickets > 20) {
            totalCost *= 0.9; // 10% discount
        }

        if (coupon == 'y') {
            totalCost *= 0.98; // 2% discount
        }

        if (refreshment == 'y') {
            totalCost += tickets * 50; // Additional refreshment cost
        }

        System.out.printf("Ticket cost:%.2f\n", totalCost);
    }
}
