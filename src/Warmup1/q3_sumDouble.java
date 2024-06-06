package Warmup1;
/*
 * https://codingbat.com/prob/p154485
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

FOR CODİNGBAT:

public int sumDouble(int a, int b) {
  int sum = a + b;
  
  if(a == b){
    sum *= 2;
  }
    return sum;
  }

 */

public class q3_sumDouble {

	public static void main(String[] args) {

		System.out.println(sumDouble(4, 5));
	}

	public static int sumDouble(int a, int b) {
		int sum = a + b;

		if (a == b) {
			sum *= 2;
		}
		return sum;
	}
}
