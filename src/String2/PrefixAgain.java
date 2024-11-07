package String2;

public class PrefixAgain {

	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		for (int i = n; i < str.length(); i++) {
			if (str.startsWith(prefix, i)) {
				return true;
			}
		}
		return false;
	}
}
