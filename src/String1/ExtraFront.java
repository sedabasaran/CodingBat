package String1;

public class ExtraFront {

	public String extraFront(String str) {
		if (str.length() < 2) {
			return str + str + str;
		} else {
			String front = str.substring(0, 2);
			return front + front + front;
		}
	}
}
