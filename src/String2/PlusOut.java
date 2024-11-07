package String2;

public class PlusOut {

	public String plusOut(String str, String word) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i).startsWith(word)) {
				result = result + word;
				i = i + word.length() - 1;
			} else {
				result = result + "+";
			}
		}
		return result;
	}
}
