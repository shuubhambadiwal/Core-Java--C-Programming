public class SumOdd1To100 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}
