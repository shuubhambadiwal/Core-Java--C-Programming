//15)
//char match
//a =>apple
//b :ball
//c :cat
//not match

import java.util.Scanner;

public class Charmatch {
    public static void main(String[] args) {
        char ch1;
        System.out.print("Enter the Character ");
        Scanner sc = new Scanner(System.in);
        ch1 = sc.next().charAt(0);
        if( ch1 == 'a' ){
            System.out.println("Apple");
        } else if( ch1 == 'b' ){
            System.out.println("Ball");
        } else if ( ch1 == 'c' ){
            System.out.println("Cat");
        } else {
            System.out.println("Not match");
        }
    }
}