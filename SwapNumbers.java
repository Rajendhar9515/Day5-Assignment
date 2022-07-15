package com.bridglab.java.basicproblams;

public class SwapNumbers {

	public static void main(String[] args) {
	int first = 34, second =14;
	System.out.println("Befor Swap");
	System.out.println("First Number =" +first);
	System.out.println("Second Number =" +second);
	
		first = first - second;
		second = first + second;
		first = second - first;
	
	
	System.out.println("after Swap");
    System.out.println("First Number =" +first);
    System.out.println("Second Number =" +second);
    

	}

}
