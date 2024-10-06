package Warmup2;

public class StringBits {
/*
https://codingbat.com/prob/p165666
 
Given a string, return a new string made of every other char starting with the first,so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"	
 */
	
	public String stringBits(String str) {
		  String temp = "";
		  for(int i = 0; i <str.length(); i += 2) {
		    temp += str.charAt(i);
		  }
		  return temp;
		}

}
