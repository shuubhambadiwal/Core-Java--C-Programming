//2)Java program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit
//        celsius
//f---->c
//        fahrenheit
//c---f
import java.util.Scanner;
public class Ifelse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius,fahrenheit;
        String choice;
        System.out.println("For F ---- > C enter the celsius || For C ---- > F enter the fahrenheit");
        choice=sc.next();
        if (choice.equals("celsius")){
            System.out.print("Enter the temperature in Fahrenheit : ");
            fahrenheit=sc.nextFloat();
            celsius=(fahrenheit-32)*5/9;
            System.out.println("The temperature in Celsius is : "+celsius);
        } else if (choice.equals("fahrenheit")){
            System.out.print("Enter the temperature in Celsius : ");
            celsius=sc.nextFloat();
            fahrenheit = (9/5*celsius) + 32;
            System.out.println("The temperature in Fahrenheit : "+fahrenheit);
        } else {
            System.out.println("Invalid choice");
        }
    }
}