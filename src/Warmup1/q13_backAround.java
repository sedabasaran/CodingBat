package Warmup1;
/*
 * https://codingbat.com/prob/p161642
Given a string, take the last char and 
return a new string with the last char added at the front and back, 
so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

 * Solution to CodingBat's:
 
public String backAround(String str) {
  String last = str.substring(str.length()-1);
  return last + str +  last;
}
 */

public class q13_backAround {
	public static void main(String[] args) {
		System.out.println(backAround("CodingBat"));
	}

	public static String backAround(String str) {
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

}
