package com.bridgelabz4;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to check for the number of digits");
        int number = scanner.nextInt();

        int digits = (int) (Math.log10(number)+1);
        System.out.println("Number of digits are " + digits);

    }
}
