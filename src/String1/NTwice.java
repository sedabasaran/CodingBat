package String1;

public class NTwice {

	public String nTwice(String str, int n) {
		String front = str.substring(0, n);
		String last = str.substring(str.length() - n);
		return front + last;
	}

}
