package String1;

public class ConCat {

	public String conCat(String a, String b) {
		if (a.isEmpty() || b.isEmpty()) {
			return a + b;
		}
		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			return a + b.substring(1);
		} else {
			return a + b;
		}
	}

}
