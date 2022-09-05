package com.bridgelabz;

import java.util.Scanner;

public class AbundandNumber {

    public static int sumOfFactors(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void abundant(int number) {
        if (sumOfFactors(number) > number) {
            System.out.println("This is a Abundand Number");
            System.out.println("Abundance of this number is : " + (sumOfFactors(number) - number));

        } else {
            System.out.println("This is not a abundand Number");
        }

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want to check");
        int number = sc.nextInt();

        abundant(number);


    }
}
