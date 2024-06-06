package Warmup1;
/*
 * https://codingbat.com/prob/p116624
 * 
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

FOR CODİNBAT SOLUTİON: 

public int diff21(int n) {
  if(n > 21 ){
    return Math.abs(n - 21)*2;
  }
  return 21-n;
}
 */

public class q4_diff21 {
	public static void main(String[] args) {
		System.out.println(diff21(15));
	}
	
	public static int diff21(int n) {
		  if(n > 21 ){
		    return Math.abs(n - 21)*2;
		  }
		  return 21-n;
		}

}
