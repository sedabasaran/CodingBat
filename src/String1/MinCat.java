package String1;

public class MinCat {

	public String minCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();

		if (lenA > lenB) {
			a = a.substring(lenA - lenB);
		} else if (lenB > lenA) {
			b = b.substring(lenB - lenA);
		}
		return a + b;
	}
}
