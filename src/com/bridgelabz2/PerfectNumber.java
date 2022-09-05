package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {


    public static int isPerfectNumber(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum = sum + i;
        }


        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want to check");
        int number = sc.nextInt();

        if (number == isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }

    }
}
