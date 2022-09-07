package com.bridgelabz4;

import java.util.Scanner;

public class AddingTwoFractions {


    public static void main(String[] args) {

        int hcf = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator for first fraction : ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator for first fraction : ");
        int den1 = sc.nextInt();
        System.out.print("Enter numerator for second fraction : ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator for second fraction : ");
        int den2 = sc.nextInt();

        sc.close();

        System.out.println("Entered Fraction is " + "(" + num1 + " / " + den1 + ") + (" + num2 + " / " + den2 + ")");

        int numerator = (num1 * den2) + (den1 * num2);

        int denominator = den1 * den2;

        for (int i = 1; i < numerator || i < denominator; i++) {

            if (numerator % i == 0 && denominator % i == 0) {
                hcf = i;
            }


        }

        System.out.println("The added fraction is " + numerator / hcf + " / " + denominator / hcf);

    }
}

