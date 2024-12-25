import java.util.Scanner;

public class Ifelse1010 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a single alphabet character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Check if the character is a letter
        if (Character.isLetter(character)) {
            // Convert the character to lowercase to make the check case-insensitive
            character = Character.toLowerCase(character);

            // Check if the character is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println(character + " is a vowel.");
            } else {
                System.out.println(character + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid alphabet character.");
        }

    }
}
