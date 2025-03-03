import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of pizzas bought:");
        int pizzas = scanner.nextInt();

        System.out.print("Enter the no of puffs bought:");
        int puffs = scanner.nextInt();

        System.out.print("Enter the no of cool drinks bought:");
        int coolDrinks = scanner.nextInt();

        scanner.close();

        int totalPrice = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);

        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizzas);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + coolDrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
