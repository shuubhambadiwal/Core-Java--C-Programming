import java.util.Scanner;

public class Ifelse7777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the type of operation
        System.out.print("Enter operation (a = Armstrong, p = Prime, e = Even, o = Odd, f = Factorial, ");
        System.out.print("r = Reverse, l = Fibonacci, t = Perfect, n = Neon, w = Leap Year, ");
        System.out.print("s = Swap One Way, v = Vowel/Consonant): ");
        char operation = scanner.next().charAt(0); // Read the first character

        // Perform the operation based on input
        switch (operation) {
            case 'a':
                System.out.print("Enter a number to check if it's Armstrong: ");
                int armstrongNumber = scanner.nextInt();
                if (isArmstrong(armstrongNumber)) {
                    System.out.println(armstrongNumber + " is an Armstrong number.");
                } else {
                    System.out.println(armstrongNumber + " is not an Armstrong number.");
                }
                break;

            case 'p':
                System.out.print("Enter a number to check if it's Prime: ");
                int primeNumber = scanner.nextInt();
                if (isPrime(primeNumber)) {
                    System.out.println(primeNumber + " is a prime number.");
                } else {
                    System.out.println(primeNumber + " is not a prime number.");
                }
                break;

            case 'e':
                System.out.print("Enter a number to check if it's Even or Odd: ");
                int evenNumber = scanner.nextInt();
                if (evenNumber % 2 == 0) {
                    System.out.println(evenNumber + " is Even.");
                } else {
                    System.out.println(evenNumber + " is Odd.");
                }
                break;

            case 'o':
                System.out.print("Enter a number to check if it's Odd or Even: ");
                int oddNumber = scanner.nextInt();
                if (oddNumber % 2 != 0) {
                    System.out.println(oddNumber + " is Odd.");
                } else {
                    System.out.println(oddNumber + " is Even.");
                }
                break;

            case 'f':
                System.out.print("Enter a number to calculate its Factorial: ");
                int factorialNumber = scanner.nextInt();
                System.out.println("Factorial of " + factorialNumber + " is: " + factorial(factorialNumber));
                break;

            case 'r':
                System.out.print("Enter a number to reverse: ");
                int reverseNumber = scanner.nextInt();
                System.out.println("Reversed number is: " + reverse(reverseNumber));
                break;

            case 'l':
                System.out.print("Enter a number for Fibonacci sequence: ");
                int fibonacciLimit = scanner.nextInt();
                fibonacci(fibonacciLimit);
                break;

            case 't':
                System.out.print("Enter a number to check if it's Perfect: ");
                int perfectNumber = scanner.nextInt();
                if (isPerfect(perfectNumber)) {
                    System.out.println(perfectNumber + " is a perfect number.");
                } else {
                    System.out.println(perfectNumber + " is not a perfect number.");
                }
                break;

            case 'n':
                System.out.print("Enter a number to check if it's Neon: ");
                int neonNumber = scanner.nextInt();
                if (isNeon(neonNumber)) {
                    System.out.println(neonNumber + " is a Neon number.");
                } else {
                    System.out.println(neonNumber + " is not a Neon number.");
                }
                break;

            case 'w':
                System.out.print("Enter a year to check if it's Leap Year: ");
                int year = scanner.nextInt();
                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
                break;

            case 's':
                System.out.print("Enter two numbers to swap (x and y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                swap(x, y);
                break;

            case 'v':
                System.out.print("Enter a character to check if it's a Vowel or Consonant: ");
                char ch = scanner.next().charAt(0);
                if (isVowel(ch)) {
                    System.out.println(ch + " is a Vowel.");
                } else {
                    System.out.println(ch + " is a Consonant.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }

        scanner.close();
    }

    // Function to check Armstrong number
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int length = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, length);
            number /= 10;
        }
        return sum == original;
    }

    // Function to check Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Function to calculate Factorial
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to reverse a number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // Function to generate Fibonacci sequence
    public static void fibonacci(int limit) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Function to check Perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Function to check Neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Function to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Function to swap two numbers
    public static void swap(int x, int y) {
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // Function to check Vowel or Consonant
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
