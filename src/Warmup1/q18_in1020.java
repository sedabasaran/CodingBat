package Warmup1;

/*
 *  https://codingbat.com/prob/p144535
 
 *  Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false 

 *  Solution to CodingBat's:

public boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}
 */
public class q18_in1020 {

	public static void main(String[] args) {
		System.out.println(in1020(7, 19));
	}

	public static boolean in1020(int a, int b) {
		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}

}
