package com.bridgelabz2;

import java.util.Scanner;

public class HcfOfNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        System.out.println("Enter  first number ");
        int number1 = sc.nextInt();
        System.out.println("Enter  Second number ");
        int number2 = sc.nextInt();

        for (int i = 1; i <= number1 || i <= number2; i++) {
            {
                if (number1 % i == 0 && number2 % i == 0) {
                    hcf = i;
                }
            }
        }
        System.out.println("Hcf of these numbers are : " + hcf);
    }
}
