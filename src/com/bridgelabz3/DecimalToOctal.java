package com.bridgelabz3;

import java.util.Scanner;

public class DecimalToOctal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert decimal to octal");

        int decimal = scanner.nextInt();
        int i = 0;
        int[] octal = new int[10];

        while (decimal != 0) {

            int rem = decimal % 8;
            octal[i] = rem;
            decimal = decimal / 8;
            i++;

        }

        System.out.print("Octal value of the number is : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(octal[j]);

        }

    }
}
