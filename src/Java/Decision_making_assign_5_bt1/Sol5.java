import java.util.Scanner;

public class Sol5 {
    public static String getSeason(int month) {
        if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Autumn";
        } else if (month == 12 || (month >= 1 && month <= 2)) {
            return "Winter";
        } else {
            return "Invalid month";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month:");
        int month = scanner.nextInt();
        scanner.close();

        String season = getSeason(month);

        if (season.equals("Invalid month")) {
            System.out.println(season);
        } else {
            System.out.println("Season:" + season);
        }
    }
}
