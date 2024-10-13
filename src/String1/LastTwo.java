package String1;

public class LastTwo {

	public String lastTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		String beginning = str.substring(0, str.length() - 2);
		String secondLast = str.substring(str.length() - 2, str.length() - 1);
		String last = str.substring(str.length() - 1);

		return beginning + last + secondLast;
	}
}
