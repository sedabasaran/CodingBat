package String1;

public class ExtraEnd {

	public String extraEnd(String str) {
		if (str.length() >= 2) {
			return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
		}
		return str;
	}
}
