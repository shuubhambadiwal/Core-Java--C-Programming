public class Fibonacciseries {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1, nextTerm, i;
        for (i = 1; i <= 10; ++i) {
            System.out.print("  " +  t1);
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }
}
