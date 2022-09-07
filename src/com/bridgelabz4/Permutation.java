package com.bridgelabz4;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        int factorial1 = 1;
        int factorial2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of Students looking for seats");
        int students = scanner.nextInt();

        System.out.println("Enter value of Seats available ");
        int seatsAvailable = scanner.nextInt();

        for (int i = 1; i <= students; i++) {
            factorial1 = factorial1 * i;

        }

        int seats = students - seatsAvailable ;

        for (int i = 1; i <= seats; i++) {
            factorial2 = factorial2 * i;

        }

        // Permutation formula is n!/(n-r)!  it gives possible number of arrangements

        int permutation = factorial1 / factorial2;

    System.out.println("Total No. of ways students can seat is " + permutation);

    }
}
