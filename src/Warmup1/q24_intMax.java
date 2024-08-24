package Warmup1;
/*
 * https://codingbat.com/prob/p101887
Given three int values, a b c, return the largest.
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 
* Solution to CodingBat's:

public int intMax(int a, int b, int c) {
  int max;
  if(a > b) {
    max = a;
  } else {
    max = b;
  }
  if(c > max) {
    max = c;
  }
  return max;
}
 
 */

public class q24_intMax {

	public static void main(String[] args) {
		System.out.println(intMax(1, 7, 9));
	}

	public static int intMax(int a, int b, int c) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}
