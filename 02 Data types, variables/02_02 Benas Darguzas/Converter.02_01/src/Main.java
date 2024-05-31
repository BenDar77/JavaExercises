import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles:");
        double numberDouble = Double.parseDouble(scanner.nextLine());
        double kilometers = (numberDouble * 1.6);
        double roundedKilometers = Math.round(kilometers * 10.0) / 10.0;
        System.out.println(numberDouble + " miles is " + roundedKilometers + " kilometers");
    }
}