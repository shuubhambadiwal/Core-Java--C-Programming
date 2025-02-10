import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();

        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        // Validate inputs
        if (a <= 0 || b <= 0 || a >= b) {
            System.out.println("Provide valid input");
        } else {
            
            printPrimesInRange(a, b);
        }

        scanner.close();
    }

    // Function to print prime numbers in the range
    private static void printPrimesInRange(int start, int end) {
        for (int num = start; num <= end; num++) { // Using for loop to iterate through the range
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        int i = 2;
        while (i <= Math.sqrt(num)) { // Using while loop for prime checking
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
