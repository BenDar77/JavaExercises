import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word: ");
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            words.add(word);
        }

        Collections.sort(words);

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}