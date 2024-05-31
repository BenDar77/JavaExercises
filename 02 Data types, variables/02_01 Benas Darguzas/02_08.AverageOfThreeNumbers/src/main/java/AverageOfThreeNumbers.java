
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        int c = Integer.parseInt(scanner.nextLine());
        double average = (double)(a + b + c) / 3.0;
        System.out.println("The average is " + average);
    }
}
