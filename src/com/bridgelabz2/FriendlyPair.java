package com.bridgelabz2;

import java.util.Scanner;

public class FriendlyPair {
    static int getFactorsSum(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum = sum + i;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number you want to check for Friendly Pair");
        int number1 = sc.nextInt();
        System.out.println("Enter  Second number you want to check for Friendly Pair ");
        int number2 = sc.nextInt();

        int sum1 = getFactorsSum(number1);

        int sum2 = getFactorsSum(number2);
        if (number1 / sum1 == number2 / sum2) {
            System.out.println(number1 + " and " + number2 + " are friendly pair numbers ");
        } else {
            System.out.println(number1 + " and " + number2 + " are not friendly pair numbers ");
        }
    }
}
