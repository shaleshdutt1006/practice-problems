package com.bridgelabz1;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int expo = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to take the power of");
        int base = sc.nextInt();
        System.out.println("Enter power of number you want to check");
        int power = sc.nextInt();
        expo = base;
        for (int i = 1; i < power; i++) {
            expo = base * expo;


        }
        System.out.println("Power of the number is : " +expo);
    }
}
