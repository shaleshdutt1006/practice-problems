package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumberWithInRange {

	public static void main(String[] args) {

		Scanner Input1 = new Scanner(System.in);
		System.out.println("Please enter the first number you want to start with ");
		int Start = Input1.nextInt();

		Scanner Input2 = new Scanner(System.in);
		System.out.println("Please enter the number you want to go up to");
		int End = Input2.nextInt();

		for (int i = Start; i <= End; i++) {
			if (PrimeNumber(i)) {

				System.out.println(i);
			}

		}
	}

	public static boolean PrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}