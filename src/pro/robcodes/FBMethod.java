package pro.robcodes;

public class FBMethod {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBuzz(i));
		}
		
	}
	
	static private String fizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "fizzbuzz";
		}
		if (num % 3 == 0) {
			return "fizz";
		}
		if (num % 5 == 0) {
			return "buzz";
		}
		return num + "";
	}

}
