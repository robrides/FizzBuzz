package pro.robcodes;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		// if a number is divisible by 3 print fizz; divisible by 5 print buzz; divisible by both print fizzbuzz
		
		Scanner kb = new Scanner(System.in);
		int count = kb.nextInt();
		
		for (int i = 1; i < count; i++) {
			if(i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0 ) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
		
		kb.close();
		
	}

}
