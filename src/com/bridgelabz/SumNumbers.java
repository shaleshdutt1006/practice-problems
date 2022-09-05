package com.bridgelabz;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String args[]) {
		int sum = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		
		int Number = sc.nextInt();

		while (i <= Number) {
			sum = Number + sum;

		}

		System.out.println(Number);

	}

}
