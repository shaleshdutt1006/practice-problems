package com.bridgelabz4;

import java.util.Scanner;

public class PrimeNumberWithInRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range you want to take prime numbers up to ");

        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }

}
