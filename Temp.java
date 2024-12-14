//   celsius = (fahrenheit - 32) * 5 / 9; C to F
// fahrenheit = (celsius * 9 / 5) + 32; F to c

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        System.out.print("In Whcih format you want to convert F or C");
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        if ("F".equals(a)) {
            int fahrenheit, celsius;
            System.out.print("Enter the celsius value ");
            celsius = sc.nextInt();
            fahrenheit = (celsius * 9 / 5) + 32; 
            System.out.print("Fahrenheit" + fahrenheit);
        } else if ("C".equals(a)){
            int fahrenheit, celsius;
            System.out.print("Enter the fahrenheit value ");
            fahrenheit = sc.nextInt();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.print("Fahrenheit" + celsius);
        }
    }
}