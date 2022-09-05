package com.bridgelabz;

import java.util.Scanner;

public class CheckingNumberSigns {

    public static void main(String args[]) {

        System.out.println("Please Enter which number you want to check");

        Scanner myObj = new Scanner(System.in);

        int number = myObj.nextInt();
        if (number < 0) {
            System.out.println("this is Negative Number");
        } else if (number > 0) {
            System.out.println("this is positive Number");

        } else {
            System.out.println("The number is zero");
        }
    }
}
