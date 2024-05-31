import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the start number:");
            int start = scanner.nextInt();

            System.out.println("Enter the end number:");
            int end = scanner.nextInt();

            if (start > end) {
                System.out.println("The start number cannot be greater than the end number. Please try again.");
                continue;
            }

            System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

            for (int num = start; num <= end; num++) {
                int digits = 0;
                int temp = num;
                while (temp > 0) {
                    temp = temp / 10;
                    digits++;
                }

                temp = num;
                int sum = 0;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += (int) Math.pow(digit, digits);
                    temp = temp / 10;
                }

                if (sum == num) {
                    System.out.println(num);
                }
            }

            break;
        }
    }

}
