//8)divisible 5 and 11
//a)num Dono se divide ho jb process ho
//b)num Kisi se bhi divide ho jb process ho

import java.util.Scanner;

public class Divisible50r11 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Divisible by 5 and 11");
        } else if (num%5==0 || num%11==0) {
            System.out.println("Divisible by one of each");
        }
        else {
            System.out.println("Not divisible by 5 and 11");
        }
    }
}