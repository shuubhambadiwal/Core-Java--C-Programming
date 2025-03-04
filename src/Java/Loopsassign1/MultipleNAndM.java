import java.util.Scanner;

public class MultipleNAndM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first multiple: ");
        int n = scanner.nextInt();
        System.out.print("Enter second multiple: ");
        int m = scanner.nextInt();
        scanner.close();

        int i = 100;
        while (i >= 1) {
            if (i % n == 0 && i % m == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
