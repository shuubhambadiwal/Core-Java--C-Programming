import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
      int arr[] = new int [2];
      try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of index 0");
          arr[0] = sc.nextInt();
          System.out.println("Enter the value of index 1");
          arr[1] = sc.nextInt();
          try{
              System.out.println("Enter the index value for the Numerator");
              int nindexn = sc.nextInt();
              int numerator = arr[nindexn];

              System.out.println("Enter the index value for the Denominator");
              int dindex = sc.nextInt();
              int denominator = arr[dindex];
              double result = numerator/denominator;
              System.out.println("Result____________" + result );
          } catch (ArithmeticException e1) {
              System.out.println("Can not divide by zero");
          }
      } catch (ArithmeticException e) {
          System.out.println("plz enter correct index value");
      }
    }
}
