package com.bridgelabz2;

import java.util.Scanner;


public class StrongNumber {

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int digits, sum = 0;
        boolean flag = false;

        while (temp != 0) {
            digits = temp % 10;
            sum = sum + factorial(digits);
            temp = temp / 10;

        }
        flag = sum == number;
        return flag;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check ");
        int number = sc.nextInt();
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number");

        } else {
            System.out.println(number + " is not a Strong Number");
        }


    }
}
