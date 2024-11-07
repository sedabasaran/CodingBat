package String2;

public class OneTwo {

	public String oneTwo(String str) {

		if (str.length() < 3) {
			return "";
		}

		String result = "";

		for (int i = 0; i < str.length() - 2; i += 3) {
			result += str.charAt(i + 1);
			result += str.charAt(i + 2);
			result += str.charAt(i);
		}
		return result;
	}
}
