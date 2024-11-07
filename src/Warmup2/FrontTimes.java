package Warmup2;

public class FrontTimes {

	/*
	 * https://codingbat.com/prob/p101475
	 * 
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front;
	 * 
	 * frontTimes("Chocolate", 2) → "ChoCho" frontTimes("Chocolate", 3) →
	 * "ChoChoCho" frontTimes("Abc", 3) → "AbcAbcAbc"
	 */

	public String frontTimes(String str, int n) {
		String temp = "";

		if (str.length() > 4) {
			for (int i = 0; i < n; i++) {
				temp += str.substring(0, 3);
			}

		} else {
			for (int j = 0; j < n; j++) {
				temp += str;
			}
		}

		return temp;
	}

}
