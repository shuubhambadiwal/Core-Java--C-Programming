import java.util.Scanner;

public class Ifelse222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Display results
        System.out.println("\n--- BMI Details ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);

    }
}