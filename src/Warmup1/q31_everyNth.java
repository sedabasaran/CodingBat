package Warmup1;
/*
 * https://codingbat.com/prob/p196441

Given a non-empty string and an int N, return the string made starting with char 0, 
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"

* Solution to CodingBat's:

public String everyNth(String str, int n) {
  String result = "";
  for(int i = 0; i < str.length(); i = i + n) {
    result = result + str.charAt(i);
  }
  return result;
}
 */

public class q31_everyNth {

	public static void main(String[] args) {
		System.out.println();
	}
	public static String everyNth(String str, int n) {
		  String result = "";
		  for(int i = 0; i < str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		}

}
