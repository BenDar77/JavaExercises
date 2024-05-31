
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = scan.nextInt();
        if (num %  2 == 0) {
            System.out.print("Number " + num + " is even.");
        }else
            System.out.print("Number " + num + " is odd.");
        }


    }

