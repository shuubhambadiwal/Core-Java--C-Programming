// 7) vowel and consonat 
// ->a e i o u vowel 
// consonant 

import java.util.Scanner;
public class Vowelconsonants {
    public static void main(String[] args) {
        char a;
        System.out.print("Enter the Chacters ");
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonents");
        }
    }
}


