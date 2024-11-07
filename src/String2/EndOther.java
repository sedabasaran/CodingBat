package String2;

public class EndOther {

	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() >= b.length()) {
			return a.endsWith(b);
		} else {
			return b.endsWith(a);
		}
	}
}
