package com.bridgelabz4;

import java.util.Scanner;

public class SumOfTwoPrimeNumber {
    public static boolean isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Enter number you want to check");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i < number/2; i++) {
            if (isPrime(i)) {

                if (isPrime(number - i)) {
                    System.out.println("This number is sum of two prime number " + i + " and " + (number - i));
                    x = 1;
                }
            }
        }
        if (x == 0) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers");

        }

    }
}
