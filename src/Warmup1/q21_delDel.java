package Warmup1;
/*
https://codingbat.com/prob/p100905

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc" 

 * Solution to CodingBat's:
 
 public String delDel(String str) {
  if(str.length()>=4 && str.substring(1,4).equals("del")) {
    return str.substring(0,1) + str.substring(4);
  }
  return str;
}
*/


public class q21_delDel {
	public static void main(String[] args) {
		System.out.println(delDel("adelbc"));
	}
	
	public static String delDel(String str) {
		  if(str.length() >= 4 && str.substring(1,4).equals("del")) {
		    return str.substring(0,1) + str.substring(4); 
		  }
		  return str;
		}

}
