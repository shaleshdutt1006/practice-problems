package com.bridgelabz;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String args[]) {
		int i = 1, sum = 0;

		System.out.println("Please Enter value you want to sum");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		
		while (i <= num) 
		{

			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
