
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num = scan.nextInt();

        System.out.print("Give the second number: ");
        int num2 = scan.nextInt();


        if (num > num2) {
            System.out.println("Greater number is: " + num);
        }else if (num == num2) {
                System.out.println("The numbers are equal!");
            }else {
                System.out.println("Greater number is: " + num2);
            }
        }
    }

