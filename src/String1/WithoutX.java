package String1;

public class WithoutX {

	public String withoutX(String str) {

		if (str.length() > 0 && str.startsWith("x")) {
			str = str.substring(1);
		}
		if (str.length() > 0 && str.endsWith("x")) {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

}
