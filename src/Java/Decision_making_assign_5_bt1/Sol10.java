import java.util.Scanner;

public class Sol10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of liters to fill the tank");
        float liters = scanner.nextFloat();

        if (liters <= 0) {
            System.out.printf("%.0f is an Invalid Input\n", liters);
            return;
        }

        System.out.println("Enter the distance covered");
        float distance = scanner.nextFloat();

        if (distance <= 0) {
            System.out.printf("%.0f is an Invalid Input\n", distance);
            return;
        }

        scanner.close();

        float litersPer100Km = (liters / distance) * 100;
        float miles = distance * 0.6214f;
        float gallons = liters * 0.2642f;
        float milesPerGallon = miles / gallons;

        System.out.println("Liters/100KM");
        System.out.printf("%.2f\n", litersPer100Km);
        System.out.println("Miles/gallons");
        System.out.printf("%.2f\n", milesPerGallon);
    }
}
