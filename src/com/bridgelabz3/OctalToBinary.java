package com.bridgelabz3;

import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to convert binary to octal");

        int i = 0;

        String binary = "";

        String octal = scanner.nextLine();

        for (i = 0; i < octal.length(); i++) {

            char ch = octal.charAt(i);

            switch (ch) {
                case '0':
                    binary = binary + "000";
                    break;
                case '1':
                    binary = binary + "001";
                    break;
                case '2':
                    binary = binary + "010";
                    break;
                case '3':
                    binary = binary + "011";
                    break;
                case '4':
                    binary = binary + "100";
                    break;
                case '5':
                    binary = binary + "101";
                    break;
                case '6':
                    binary = binary + "110";
                    break;
                case '7':
                    binary = binary + "111";
                    break;
                default:
                    System.out.println("Invalid Octal Digit");
                    return;
            }
        }

        System.out.println("Equivalent Binary Value is  " + binary);
    }
}

