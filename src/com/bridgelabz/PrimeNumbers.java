package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {
	public static boolean PrimeNumber(int Output) {
		if (Output <= 1) {
			return false;
		}
		for (int i = 2; i < Output; i++) {
			if (Output % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Please enter the number you want to check is prime or not");
		int Output = Input.nextInt();

		if (PrimeNumber(Output)) {
			System.out.println(Output + " is a prime number");
		} else {
			System.out.println(Output + " is not a prime number");
		}
	}

}
