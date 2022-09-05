package com.bridgelabz;

public class SmallestOfThree {

	public static void main(String[] args) {

		int num1 = 20, num2 = 40, num3 = 50;

		if (num1 < num2 && num1 < num3) {
			System.out.println("First Number is the Smallest");
		} else if (num2 < num3 && num2 < num1) {
			System.out.println("Second Number is the Smallest");
		}
		if (num3 < num2 && num3 < num1) {
			System.out.println("Third Number is the Smallest");
		}

	}

}
