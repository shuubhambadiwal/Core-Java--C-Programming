import java.util.Scanner;

public class UserTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for table: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
