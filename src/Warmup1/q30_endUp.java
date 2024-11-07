package Warmup1;

/*
 * https://codingbat.com/prob/p125268
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 
chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

* Solution to CodingBat's:
* 
public String endUp(String str) {
  if (str.length() <= 3) 
  return str.toUpperCase();
  
  String last = str.substring(str.length() - 3).toUpperCase();
  String front =  str.substring(0, str.length() - 3);
  return front + last;
}

 */
public class q30_endUp {

	public static void main(String[] args) {
		System.out.println(endUp("Hello"));
	}

	public static String endUp(String str) {
		if (str.length() <= 3)
			return str.toUpperCase();

		String last = str.substring(str.length() - 3).toUpperCase();
		String front = str.substring(0, str.length() - 3);
		return front + last;
	}

}
