import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of students placed in CSE:");
        int cse = scanner.nextInt();

        System.out.print("Enter the no of students placed in ECE:");
        int ece = scanner.nextInt();

        System.out.print("Enter the no of students placed in MECH:");
        int mech = scanner.nextInt();

        scanner.close();

        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is Invalid");
            return;
        }

        if (cse == ece && ece == mech) {
            System.out.println("None of the department has got the highest placement");
            return;
        }

        int maxPlacement = Math.max(cse, Math.max(ece, mech));
        System.out.println("Highest placement");

        if (cse == maxPlacement) {
            System.out.println("CSE");
        }
        if (ece == maxPlacement) {
            System.out.println("ECE");
        }
        if (mech == maxPlacement) {
            System.out.println("MECH");
        }
    }
}
