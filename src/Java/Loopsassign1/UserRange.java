import java.util.Scanner;

public class UserRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        scanner.close();

        while (start <= end) {
            System.out.print(start + " ");
            start++;
        }
    }
}
