package Warmup1;

/* https://codingbat.com/prob/p190570
 * Given a non-empty string and an int n, 
 * return a new string where the char at index n has been removed. 
 * The value of n will be a valid index of a char in the original string 
 * (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 * 
 * Solution to CodingBat's:

 * public String missingChar(String str, int n) {
  String firstHalf = str.substring(0,n);
  String lastHalf = str.substring(n+1, str.length());
  return firstHalf + lastHalf;
}

 */
public class q10_missingChar {
	public static void main(String[] args) {
		System.out.println(missingChar("missing", 6));
	}
	
	public static String missingChar(String str, int n) {
		  String firstHalf = str.substring(0,n);
		  String lastHalf = str.substring(n+1, str.length());
		  return firstHalf + lastHalf;
		}

}
