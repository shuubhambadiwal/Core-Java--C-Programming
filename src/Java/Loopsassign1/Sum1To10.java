public class Sum1To10 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
