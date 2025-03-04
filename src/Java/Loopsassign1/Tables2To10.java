public class Tables2To10 {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            }
            System.out.println();
            num++;
        }
    }
}
