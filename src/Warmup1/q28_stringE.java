package Warmup1;
/*
 * https://codingbat.com/prob/p173784
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 * Solution to CodingBat's:

 */

public class q28_stringE {
	public static void main(String[] args) {
		System.out.println(stringE("Hello"));
	}

	public static boolean stringE(String str) {
		int countE = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				countE++;
			}
		}
		return countE >= 1 && countE <= 3;
	}

}
