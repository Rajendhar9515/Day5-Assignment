package com.bridglab.java.basicproblams;

import java.util.Scanner;

public class VowelConsonat {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		
		char Char = reader.next().charAt(0);
		
		if(Char == 'a' || Char == 'e' ||Char == 'i' || Char == 'o' || Char == 'u' ) {
			System.out.println(Char+" is Vowel");
		}else {
			System.out.println(Char+" is consonat");
		}
		

	}

}
