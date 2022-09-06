package com.bridgelabz3;

import java.util.Scanner;

public class DecimalToBinary {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert decimal to binary");

        int decimal = scanner.nextInt();

        int binary[] = new int[20];
        int i = 0;

        while (decimal > 0) {
            int rem = decimal % 2;

            binary[i] = rem;

            decimal = decimal / 2;
            i++;

        }
        System.out.print("Your binary number is : ");

        for (int j = i - 1; j >= 0; j--) {

            System.out.print(binary[j]);

        }


    }
}
