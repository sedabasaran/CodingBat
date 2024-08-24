package Warmup1;
/*
 * https://codingbat.com/prob/p191022
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * 
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

 * Solution to CodingBat's:
 
 public boolean startHi(String str) {
  if(str.length() < 2) 
    return false;
  String startHi = str.substring(0,2);
  
  if(startHi.equals("hi")) {
    return true;
  } else {
  return  false;
  }
}
 */
public class q16_startHi {
	public static void main(String[] args) {
		System.out.println(startHi("hi there"));
	}
	public static boolean startHi(String str) {
		  if(str.length() < 2) 
		    return false;
		  String startHi = str.substring(0,2);
		  
		  if(startHi.equals("hi")) {
		    return true;
		  } else {
		  return  false;
		  }
	}
}
