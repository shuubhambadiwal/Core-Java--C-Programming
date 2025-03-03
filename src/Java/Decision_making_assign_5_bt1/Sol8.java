import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.println("Enter the digits:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        for (int num : numbers) {
            System.out.println(num + "-" + (char) num);
        }
    }
}