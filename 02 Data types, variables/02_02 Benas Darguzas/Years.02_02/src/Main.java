import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesInYear = 365 * 24 * 60;
        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
