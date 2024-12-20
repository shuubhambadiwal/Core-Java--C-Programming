//12)m =you are male
//        f = female
//        other

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        System.out.print("Enter the word ");
        char gen;
        Scanner sc = new Scanner(System.in);
        gen = sc.next().charAt(0);
        if (gen == 'm' || gen == 'M') {
            System.out.println("You are male");
        } else if (gen == 'm' || gen == 'F') {
            System.out.println("You are female");
        } else {
            System.out.println("Invalid input");
        }
    }
}