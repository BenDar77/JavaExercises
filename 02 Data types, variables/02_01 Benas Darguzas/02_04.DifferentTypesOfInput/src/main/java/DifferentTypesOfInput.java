
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        System.out.println("Give a string:");
        String word = scanner.nextLine();

        System.out.println("Give an integer:");
        int numberInt = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double numberDouble = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean Boolean = scanner.nextBoolean();

        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + numberInt);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + Boolean);

        scanner.close();
    }


}
