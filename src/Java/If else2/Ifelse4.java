//4)java program to check whether a character is an alphabet or not
//input =a =alpha
//digit :
//3 =this is a digit

import java.util.Scanner;

public class Ifelse4 {

    public static void main(String[] args) {
        System.out.print("Enter a character ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("character");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("not a character");
        }
    }
}







