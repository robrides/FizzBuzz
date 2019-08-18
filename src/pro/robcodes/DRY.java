package pro.robcodes;

public class DRY {

	static String FIZZ = "fizz";
	static String BUZZ = "buzz";
	static int DENOM1 = 3; 
	static int DENOM2 = 5; 

	public static void main(String[] args) {
		int i = 1;
		boolean fizz = false, buzz = false;
		
		do {
			fizz = modulo(i, DENOM1);
			buzz = modulo(i, DENOM2);

			if (fizz && buzz) {
				print(FIZZ + BUZZ);
			} else if (fizz) {
				print(FIZZ);
			} else if (buzz) {
				print(BUZZ);
			} else {
				print(i + "");
			}
			i += 1;
		} while (i <= 100);

	}

	private static boolean modulo(int numerator, int denominator) {
		if (numerator % denominator == 0) {
			return true;
		}
		return false;
	}
	
	private static void print(String str) {
		System.out.println(str);
	}
}
