package com.bridglab.java.basicproblams;

public class FlipCoin {

	public static void main(String[] args) {
		double value = Math.random();
		System.out.println("randam value is :" +value);
			if (value < 0.5) {
				System.out.println("That is tails");
			} else {
				System.out.println("That is Heads");
			}

	}

}
