import java.util.Scanner;

public class Ifelse666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature and unit
        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit (C for Celsius, F for Fahrenheit):");
        char unit = scanner.next().toUpperCase().charAt(0);

        // Perform conversion and display result
        if (unit == 'C') {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C is equal to " + fahrenheit + "°F.");
        } else if (unit == 'F') {
            double celsius = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F is equal to " + celsius + "°C.");
        } else {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

    }
}
