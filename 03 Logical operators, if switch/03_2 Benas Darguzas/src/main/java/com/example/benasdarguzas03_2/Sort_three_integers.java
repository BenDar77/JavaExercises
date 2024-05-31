package com.example.benasdarguzas03_2;


import java.util.Scanner;

public class Sort_three_integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();


        int temp;
        if (number2 < number1 || number3 < number1) {
            if (number2 < number1) {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            if (number3 < number1) {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }
        if (number3 < number2) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }


        System.out.println("Numbers are arranged in non-decreasing order: " + number1 + " " + number2 + " " + number3);
    }
}
