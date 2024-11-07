package String2;

public class MixString {

	public String mixString(String a, String b) {
		String result = "";
		int maxLength = Math.max(a.length(), b.length());

		for (int i = 0; i < maxLength; i++) {
			if (i < a.length()) {
				result += a.charAt(i);
			}
			if (i < b.length()) {
				result += b.charAt(i);
			}
		}
		return result;
	}

}
