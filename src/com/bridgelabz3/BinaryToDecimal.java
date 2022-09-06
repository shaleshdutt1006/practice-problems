package com.bridgelabz3;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int decimal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert binary to decimal");
        int number = scanner.nextInt();
        int temp = number;
        int n = 0;
        while (temp != 0) {

            int rem = temp % 10;
            decimal = (int) (decimal + rem * Math.pow(2, n));
            temp /= 10;
            n++;
        }
        System.out.println("Decimal value of the number is " + decimal);

    }
}
