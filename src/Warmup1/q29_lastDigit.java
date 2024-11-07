package Warmup1;
/*
 * https://codingbat.com/prob/p125339
Given two non-negative int values, return true if they have the same last digit, 
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

* Solution to CodingBat's:

public boolean lastDigit(int a, int b) {
  
  int aRemainder = a % 10;
  int bRemainder = b % 10;
  
  if(aRemainder == bRemainder) {
    return true;
  }
  return false;
}
 */

public class q29_lastDigit {
	public static void main(String[] args) {
		System.out.println();
	}

	public static boolean lastDigit(int a, int b) {

		int aRemainder = a % 10;
		int bRemainder = b % 10;

		if (aRemainder == bRemainder) {
			return true;
		}
		return false;
	}

}
