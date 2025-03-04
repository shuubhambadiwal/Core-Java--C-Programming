public class Multiple7And3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 7 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
