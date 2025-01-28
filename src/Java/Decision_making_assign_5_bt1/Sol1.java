import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car no: ");
        String input = scanner.nextLine();

        // Check if the input is a valid 4-digit number
        if (isValidCarNumber(input)) {
            int carNumber = Integer.parseInt(input);
            int sum = getSumOfDigits(carNumber);

            // Check if the sum is divisible by 3, 5, or 7
            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Sorry its not my lucky number");
            }
        } else {
            System.out.println(input + " is not a valid car number");
        }

        scanner.close();
    }

    // Function to validate if the input is a 4-digit positive number
    private static boolean isValidCarNumber(String input) {
        if (input.matches("\\d{4}")) { // Check if it's exactly 4 digits
            return true;
        }
        return false;
    }

    // Function to calculate the sum of digits of a number
    private static int getSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
