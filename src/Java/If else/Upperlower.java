//9)uper case and lower case input by user
//A p

import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (str.equals(str.toUpperCase())) {
            System.out.println("The string is in upper case");
        } else if (str.equals(str.toLowerCase())) {
            System.out.println("The string is in lower case");
        }
        else {
            System.out.println("Input not matched");
        }
    }
}