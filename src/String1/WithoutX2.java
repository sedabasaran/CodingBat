package String1;

public class WithoutX2 {

	public String withoutX2(String str) {
		String result = "";

		if (str.length() > 0 && str.charAt(0) != 'x') {
			result += str.charAt(0);
		}

		if (str.length() > 1 && str.charAt(1) != 'x') {
			result += str.charAt(1);
		}

		if (str.length() > 2) {
			result += str.substring(2);
		}

		return result;
	}
}
