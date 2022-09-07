package com.bridgelabz4;

import java.util.Scanner;

public class Handshakes {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Persons you want to handshakes with each other");

        int persons = scanner.nextInt();


        int handshakes = persons * (persons - 1) / 2;
        System.out.println("Total number of handshakes are : " + handshakes);

    }
}
