package com.bridglab.java.basicproblams;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter power value");
		int power = input.nextInt();
		int result = 1;
		int i = 1;
		for (i = 1; i <= power; i++) {
			result *= 2;
			System.out.println("Power of 2 = " + result);
		}

	}

}
