package Warmup1;

/*
 *
Given an int n, return true if it is within 10 of 100 or 200. 
Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

Solution to CodingBat's:

public boolean nearHundred(int n) {
  if((Math.abs(100-n) <= 10) || (Math.abs(200 - n) <= 10)) {
    return true;
  }
  return false;
}

 */

public class q7_nearHundred {
	public static void main(String[] args) {
		System.out.println(nearHundred(20));
	}

	public static boolean nearHundred(int n) {
		if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
			return true;
		}
		return false;
	}

}
