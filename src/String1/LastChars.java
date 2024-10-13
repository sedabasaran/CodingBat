package String1;

public class LastChars {

	public String lastChars(String a, String b) {
		if (a.length() == 0 && b.length() == 0) {
			return "@@";
		}

		if (a.length() == 0) {
			if (b.length() > 0) {
				return "@" + b.substring(b.length() - 1);

			}
		}

		if (b.length() == 0) {
			return a.substring(0, 1) + "@";
		}

		return a.substring(0, 1) + b.substring(b.length() - 1);
	}
}