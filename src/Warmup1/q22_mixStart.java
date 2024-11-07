package Warmup1;

/*
https://codingbat.com/prob/p151713
Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

Solution to CodingBat's:

public boolean mixStart(String str) {
  if(str.length()>=3 && str.substring(1,3).equals("ix")) {
        return true;
  } 
  return false;
}
 */

public class q22_mixStart {
	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks"));
	}

	public static boolean mixStart(String str) {
		if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
			return true;
		}
		return false;
	}
}
