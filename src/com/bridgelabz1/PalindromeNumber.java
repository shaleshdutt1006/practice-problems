package com.bridgelabz1;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int number = sc.nextInt();
        int num = number;

        for (int i = 0; number > 0; i++) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (num == reverse) {
            System.out.println("Number is Palindrome number");
        } else {
            System.out.println("Number is not Palindrome number");
        }
    }
}



