public class SumEven1To100 {
    public static void main(String[] args) {
        int sum = 0, i = 2;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
