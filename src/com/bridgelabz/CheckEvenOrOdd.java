package com.bridgelabz;

import java.util.Scanner;

public class CheckEvenOrOdd {


    public static void main(String args[]) {

        System.out.println("Please Enter which number you want to check");

        Scanner myObj = new Scanner(System.in);

        int number = myObj.nextInt();
        if (number % 2 == 0) {
            System.out.println("this is a Even Number");
        } else {
            System.out.println("this is a Odd Number");
        }

    }
}
