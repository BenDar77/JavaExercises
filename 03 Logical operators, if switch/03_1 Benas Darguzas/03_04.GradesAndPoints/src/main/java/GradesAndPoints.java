
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give points [0-100]:");
        int score = scan.nextInt();

        if (score > 100) {
            System.out.println("Grade: incredible!");

        } else if (score >= 90) {
            System.out.println("Grade: 5");

        } else if (score >= 80) {
            System.out.println("Grade: 4");

        }else if (score >= 70){
            System.out.println("Grade: 3");

        } else if (score >= 60){
            System.out.println("Grade: 2");
        }
        else if (score >= 50){
            System.out.println("Grade: 1");
        }
        else if (score <= 49 && score >= 0){
            System.out.println("Grade: failed");
        }
        else if (score < 0){
            System.out.println("Grade: impossible!");
        }


    }
}