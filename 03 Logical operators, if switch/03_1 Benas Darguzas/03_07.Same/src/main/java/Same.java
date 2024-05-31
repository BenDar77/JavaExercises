import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String string = scan.nextLine();
        System.out.print("Enter the second string:");
        String string2 = scan.nextLine();

        if (string.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}