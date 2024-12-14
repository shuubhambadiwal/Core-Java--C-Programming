
// 100-90 A
// 89-65 B
// 64-50 C
// 49 - 30 D
// 29 - 0 F

import java.util.Scanner;

public class Gradecalu {
    public static void main(String[] args) {
        System.out.println("Enter the marks of the student ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num>=90 && num<= 100) {
            System.out.println("A");
        } else if (num>=65 && num<= 89) {
            System.out.println("B");
        } else if (num>=50 && num<= 64) {
            System.out.println("C");
        } else if (num>=30 && num<= 49) {
            System.out.println("D");
        } else if (num>=0 && num<= 29){
            System.out.println("F");
        }
    }
}
