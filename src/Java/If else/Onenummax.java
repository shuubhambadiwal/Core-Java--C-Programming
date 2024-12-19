// 2)one number max a>10 
// one number :

import java.util.Scanner;

public class Onenummax {
    public static void main(String[] args){
        int num;
        System.out.print("Enter the number value");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num==10) {
            System.out.println("Equals");
        } else if (num>10) {
            System.out.println("Maximum");
        } 
        else {
            System.out.println("Minimun");
        }
    }
}
