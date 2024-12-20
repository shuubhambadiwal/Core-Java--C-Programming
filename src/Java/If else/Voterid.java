// 1)voter id 
// =>user input 

import java.util.Scanner;

public class Voterid {
    public static void main(String[] args){
        int age;
        System.out.print("Enter the Age of the person ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>=18) {
            System.out.println("Eligble for Voting");
        } else {
            System.out.println("Not Eligble for voting");
        }
    }
}


