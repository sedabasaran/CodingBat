package Warmup2;

public class StringMatch {
/*
https://codingbat.com/prob/p198640
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0	
 */

	public int stringMatch(String a, String b) {
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  for(int i = 0; i < len-1; i++) {
		    String matchA = a.substring(i, i+2);
		    String matchB = b.substring(i, i+2);
		    if(matchA.equals(matchB)) {
		      count++; 
		    }
		  }
		  return count;
		}

}
