package com.example.benasdarguzas03_2;

import java.util.Scanner;

public class Palidrome_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();


        int digit1 = (int) (number / 100);
        int remaining = number % 100;
        int digit3 = (int) (remaining % 10);


        System.out.println(
                number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");


    }
}

