import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type a word: ");
            String input = scanner.nextLine();

            if (words.contains(input)) {
                System.out.println("You gave the word " + input + " twice");
                break;
            } else {
                words.add(input);
            }
        }

        scanner.close();
    }
}