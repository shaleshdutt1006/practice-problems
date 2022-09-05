package com.bridgelabz1;

import java.util.Scanner;

public class ArmStrongNumber {
    public static int power = 0;

    public static int power(int number) {
        while (number != 0) {
            number = number / 10;
            power++;
        }
        return power;
    }

    public static int armstrongSum(int number, int len) {
        if (number == 0) {
            return 0;
        }
        int sum = 0;
        while (number != 0) {
            int digits = number % 10;
            int a = (int) Math.pow(digits, len);
            number = number / 10;
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to check ");
        int number = sc.nextInt();
        int len = power(number);

        if (number == armstrongSum(number, len))
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is not an Armstrong Number");

    }

}

