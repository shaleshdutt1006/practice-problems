package com.bridgelabz2;

import java.util.Scanner;

public class HarshadNumber {
    static int sumOfDigits(int number) {
        int sum = 0;
        int i = 1;

        while (number != 0) {
            int digits = number % 10;
            sum = sum + digits;
            number = number / 10;
        }
        return sum;

    }

    public static void harshad(int number) {
        if (number % sumOfDigits(number) == 0) {
            System.out.println("This is Harshad Number");

        } else {
            System.out.println("This is not a Harshad Number");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");

        int number = sc.nextInt();

        harshad(number);

    }
}
