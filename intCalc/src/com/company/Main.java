package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Initial: ");
        Scanner initial = new Scanner(System.in);
        byte in1 = initial.nextByte();
        System.out.print("Rate: ");
        Scanner rate = new Scanner(System.in);
        byte rate1 = initial.nextByte();
        System.out.print("Length: ");
        Scanner length = new Scanner(System.in);
        byte l1 = initial.nextByte();

        System.out.println("Mortgage: " + in1 + rate1 + l1);
    }
}
