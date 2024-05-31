import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a word: ");

        while (true) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
            System.out.println("Type a word: ");
        }

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}