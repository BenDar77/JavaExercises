import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Give speed: ");


        int num = scan.nextInt();

        if (num > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}
