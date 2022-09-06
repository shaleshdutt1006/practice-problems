package com.bridgelabz3;

import java.util.Scanner;

public class DecimalToHexaDecimal {

    public static void main(String[] args) {
        char a;
        int rem = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert  from decimal to Hexadecimal");

        int decimal = scanner.nextInt();


        String hexa = "";

        String s = "0123456789ABCDEF";

        while (decimal != 0) {
            rem = decimal % 16;

            a = s.charAt(rem);

            hexa = a + hexa;

            decimal = decimal / 16;

        }
        System.out.print(hexa);
    }


}



