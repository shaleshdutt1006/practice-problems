package com.bridgelabz3;

import java.util.Scanner;

public class OctalToDecimal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert Octal to decimal");
        int number = scanner.nextInt();
        int n = 0;
        int decimal = 0;
        int temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            decimal += remainder * Math.pow(8, n);
            temp /= 10;
            n++;
        }
        System.out.println("Decimal number is " + decimal);
    }
}
