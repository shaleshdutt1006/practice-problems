package com.bridgelabz;

import java.util.Scanner;

public class SumOfFirstN
{

	
		public static void main(String args[]) 
		{
				int i = 1, sum = 0;

				System.out.println("Please Enter First N Natural Number you want to sum");

				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();

				
				sum = num * ( num + 1 ) / 2;
				System.out.println(sum);

			}

		
}


