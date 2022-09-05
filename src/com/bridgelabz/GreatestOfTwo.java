package com.bridgelabz;

import java.util.Scanner;

public class GreatestOfTwo {

	public static void main(String[] args) {
		Scanner Input1 = new Scanner(System.in);
		System.out.println("Please enter the first Number");

		int Number1 = Input1.nextInt();

		Scanner Input2 = new Scanner(System.in);
		System.out.println("Please enter the Second Number");

		int Number2 = Input1.nextInt();

		if (Number1 > Number2) {
			System.out.println("First is Greater");
		} else if (Number2 > Number1) {
			System.out.println("Second Number is Greater");
		} else {
			System.out.println("Both Numbers are equal");
		}

	}

}
