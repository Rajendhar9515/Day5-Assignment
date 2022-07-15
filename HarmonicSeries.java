package com.bridglab.java.basicproblams;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");	
		int num = in.nextInt();
		double result = 1.0;
		System.out.println("The Hormonic Series is");
		
		for (int i=num; i>0; i--) {
			result =result+(double)1/i;
			System.out.print( result + ",");
			
	}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	