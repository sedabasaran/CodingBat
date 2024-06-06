package Warmup1;
/*
 * https://codingbat.com/prob/p191914
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged. 
 * Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad

Solution to CodingBat's:

public String notString(String str) {
  if (str.length() >= 3 && str.substring(0,3).equals("not")) {
    return str;
  } 
  return "not" + " " + str;
}


 */
public class q9_notString {
	public static void main(String[] args) {
		System.out.println(notString("x"));
	}

	public static String notString(String str) {
		  if (str.length() >= 3 && str.substring(0,3).equals("not")) {
		    return str;
		  } 
		  return "not" + " " + str;
		}

}
