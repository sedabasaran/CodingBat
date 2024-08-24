package Warmup1;

/*
 *https://codingbat.com/prob/p177372
 * Given 2 positive int values,return the larger value that is in 
 * the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 
 * Solution to CodingBat's:

 public int max1020(int a, int b) {
  int max = 0;
  if(a >= 10 && a <= 20) {
    max = a;
  }
  if(b > max && (b >= 10 && b <= 20)) {
    max = b;
  }
  return max;
}  
 */
public class q27_max1020 {
	public static void main(String[] args) {
		System.out.println(max1020(15, 13));
	}

	public static int max1020(int a, int b) {
		int max = 0;
		if (a >= 10 && a <= 20) {
			max = a;
		}
		if (b > max && (b >= 10 && b <= 20)) {
			max = b;
		}
		return max;
	}
}
