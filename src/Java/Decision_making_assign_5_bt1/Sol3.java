import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter the number:");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid Input");
        } else {
            // Check if the number is a palindrome
            if (isPalindrome(number)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

        scanner.close();
    }

    // Function to check if a number is palindrome
    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Compare original and reversed number
        return original == reversed;
    }
}
