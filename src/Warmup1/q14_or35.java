package Warmup1;
/*
https://codingbat.com/prob/p112564
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
Use the % "mod" operator

or35(3) → true
or35(10) → true
or35(8) → false 
 
* Solution to CodingBat's:
public boolean or35(int n) {
  return (n % 3 == 0) ||( n % 5 == 0);
}
 */

public class q14_or35 {
	public static void main(String[] args) {
		System.out.println(or35(9));
	}

	public static boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}
}
