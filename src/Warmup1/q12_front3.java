package Warmup1;
/*
 * https://codingbat.com/prob/p136351

 * Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

Solution to CodingBat's:

 public String front3(String str) {
  String front;
  
  if (str.length() < 3) {
    front = str;
  }
  else {
    front = str.substring(0, 3);
  }

  return front + front + front;
}
 */

public class q12_front3 {
	public static void main(String[] args) {
		System.out.println(front3("Java"));
	}

	public static String front3(String str) {
		String front;

		if (str.length() < 3) {
			front = str;
		} else {
			front = str.substring(0, 3);
		}

		return front + front + front;
	}

}
