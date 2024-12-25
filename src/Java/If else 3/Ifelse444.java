import java.util.Scanner;

public class Ifelse444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input time of day
        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfDay = scanner.nextLine().toLowerCase();

        // Determine and display greeting
        if (timeOfDay.equals("morning")) {
            System.out.println("Good morning!");
        } else if (timeOfDay.equals("afternoon")) {
            System.out.println("Good afternoon!");
        } else if (timeOfDay.equals("evening")) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Invalid input. Please enter 'morning', 'afternoon', or 'evening'.");
        }

    }
}