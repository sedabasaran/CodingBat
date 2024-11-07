package String2;

public class RepeatEnd {

	public String repeatEnd(String str, int n) {
		String lastN = str.substring(str.length() - n);
		String result = "";

		for (int i = 0; i < n; i++) {
			result += lastN;
		}
		return result;
	}

}
