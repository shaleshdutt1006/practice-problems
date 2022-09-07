package com.bridgelabz4;

import java.util.Scanner;

public class ReplacingInputDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();

        String input = Integer.toString(number);
        int len = input.length();

        String result = "";

        for (int i = 0; i < len; i++) {

            if (input.charAt(i) == '0') {

                result = result + '1';
            } else {
                result = result + input.charAt(i);
            }
        }

        System.out.println("Converted number is: " + result);


    }
}
