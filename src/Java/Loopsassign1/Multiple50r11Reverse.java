public class Multiple50r11Reverse {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 1) {
            if (i % 5 == 0 || i % 11 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
