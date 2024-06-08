package Warmup1;
/*
 * https://codingbat.com/prob/p123384
 * Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

Solution to CodingBat's:

public String frontBack(String str) {
  if(str.length() <= 1) {
      return str;
  }
  
  char firstCh = str.charAt(0);
  String mid = str.substring(1, str.length()-1);
  char lastCh = str.charAt(str.length()-1);
  
  return lastCh + mid + firstCh ;
    
}
 */

public class q11_frontBack {
	public static void main(String[] args) {
		System.out.println(frontBack("code"));
	}

	public static String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}

		char firstCh = str.charAt(0);
		String mid = str.substring(1, str.length() - 1);
		char lastCh = str.charAt(str.length() - 1);

		return lastCh + mid + firstCh;

	}

}
