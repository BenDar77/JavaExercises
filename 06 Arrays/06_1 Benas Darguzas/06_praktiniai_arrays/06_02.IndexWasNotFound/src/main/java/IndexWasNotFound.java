

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        while (counter < array.length) {
            if (searching == array[counter]) {
                System.out.println(searching + " is at index " + counter + ".");
            }
            counter++;
        }
        System.out.println(searching + " was not found.");
    }

}