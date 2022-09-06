package com.bridgelabz3;

import java.util.Scanner;

public class HexadecimalToDecimal {

    static int getDecimal(String hex) {

        String digits = "0123456789ABCDEF";

        hex = hex.toUpperCase();
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {

            char c = hex.charAt(i);

            int d = digits.indexOf(c);

            decimal = 16 * decimal + d;
        }
        return decimal;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number you want to convert Hexadecimal to decimal");

        String hex = scanner.nextLine();

        System.out.println("Decimal value of the number is: " + getDecimal(hex));


    }
}
