package com.bridgelabz3;

import java.util.Scanner;

public class BinaryToOctal {
    static int binaryToDecimal(int binary) {
        int n = 0;
        int decimal = 0;
        while (binary != 0) {

            int rem = binary % 10;

            decimal += rem * Math.pow(2, n);

            binary = binary / 10;

            n++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert binary to octal");

        int binary = scanner.nextInt();

        int[] octal = new int[20];

        int decimal = binaryToDecimal(binary);

        while (decimal != 0) {

            int rem = decimal % 8;
            octal[i] = rem;
            decimal = decimal / 8;
            i++;
        }

        System.out.print("Octal number is : ");

        for (int j = i - 1; j >= 0; j--) {

            System.out.print(octal[j]);

        }

    }
}
