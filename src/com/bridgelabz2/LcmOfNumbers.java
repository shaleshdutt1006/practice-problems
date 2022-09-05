package com.bridgelabz2;

import java.util.Scanner;

public class LcmOfNumbers {
    static int maximumOfTwoNumber(int number1, int number2) {

        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        int lcm = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number you want to tak lcm of ");
        int number1 = sc.nextInt();

        System.out.println("Enter  Second number you want to take lcm of  ");
        int number2 = sc.nextInt();

        System.out.println(maximumOfTwoNumber(number1, number2));

        for (int i = maximumOfTwoNumber(number1, number2); i <= number1 * number2; i++) {

            if (i % number1 == 0 && i % number2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("Lcm of the number is : " + lcm);


    }
}
