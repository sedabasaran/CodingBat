package String2;

public class RepeatFront {

	public String repeatFront(String str, int n) {
		String result = "";

		for (int i = n; i >= 0; i--) {
			result += str.substring(0, i);
		}
		return result;
	}

}
