package com.bridgelabz3;

import java.util.Scanner;

public class LcmOfNumber {

    static int greaterNumber(int number1 , int number2 ){

        if (number1>number2)
        {
            return number1;
        }
        else {
            return number2;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lcm = 0;

        System.out.println("Enter  first number ");
        int number1 = scanner.nextInt();

        System.out.println("Enter  Second number ");
        int number2 = scanner.nextInt();

        for (int i = greaterNumber(number1 , number2) ; i < number1*number2; i++) {

            if (i % number1 == 0 && i % number2 == 0) {

                lcm = i ;
                break;
            }

        }

        System.out.println("Lcm of the number is " + lcm);

    }
}
