//6) Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
//   ->meter ===>cm
//        mid
//        low
//        high

import java.util.Scanner;
public class Ifelse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in centimeters : ");
        int height = sc.nextInt();
        if(height >= 140){
            System.out.println("High");
        }
        else if(height >= 90){
            System.out.println("mid");
        }
        else{
            System.out.println("Low");
        }
    }
}












