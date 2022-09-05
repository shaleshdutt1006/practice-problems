package com.bridgelabz2;

import java.util.Scanner;

public class PerfectSquare {

    static void squareRoot(int number){


            if (Math.ceil(Math.sqrt(number)) == Math.floor(Math.sqrt(number)))
            {
                System.out.print(number + " is a Perfect Square Number");
            }
            else
            {
                System.out.print(number + " is not a Perfect Square Number");
            }
        }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int number = sc.nextInt();

        squareRoot(number);

    }
}
