public class EvenUserRange {
    public static void main(String[] args) {
        int start = 34, end = 67;
        while (start <= end) {
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
