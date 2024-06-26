package Warmup1;

/*
 * https://codingbat.com/prob/p187868
 * Warmup-1 > sleepIn
The parameter weekday is true if it is a weekday, 
and the parameter vacation is true if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. 
Return true if we sleep in.


Expected	           Run		
sleepIn(false,false)→  true	
sleepIn(true,false) →  false	
sleepIn(false,true) →  true		
sleepIn(true,true)  →  true	

Solution to CodingBat's:

public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}

 */
public class q1_sleepIn {

	public static void main(String[] args) {

		System.out.println(sleepIn(true, true));
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}

}
