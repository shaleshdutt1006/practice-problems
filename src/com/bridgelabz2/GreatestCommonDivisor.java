package com.bridgelabz2;

import java.util.Scanner;

public class GreatestCommonDivisor {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number ");
        int number1 = sc.nextInt();

        System.out.println("Enter  Second number ");
        int number2 = sc.nextInt();

        while (number1 != number2) {
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }


        System.out.println("The HCF: " + number1);
    }
}




