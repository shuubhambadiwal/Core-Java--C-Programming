//3)  Check whether the Traingle , Square , Reactanlge (Area & Volume)
//        ->Input area /volume
//        Area
//        Traingle square rectangle
//        Square

import java.util.Scanner;
public class Ifelse3 {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input ");
        choice = sc.nextLine();
        if (choice.equals("A=1/2(b*h)")) {
            System.out.println("Triangle");
        } else if (choice.equals("V=1/2*b*h*l")) {
            System.out.println("Triangle");
        } else if (choice.equals("S=s*s")) {
            System.out.println("Square");
        } else if (choice.equals("S=s*s*s")) {
            System.out.println("Square");
        } else  if (choice.equals("V=l*w*h")){
            System.out.println("Rectangle");
        } else if (choice.equals("A=w*l")){
            System.out.println("Rectangle");
        }
    }
}