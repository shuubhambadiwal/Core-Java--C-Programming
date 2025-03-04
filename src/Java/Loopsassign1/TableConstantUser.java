import java.util.Scanner;

public class TableConstantUser {
    public static void main(String[] args) {
        System.out.println("2 X 1 = 2");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
