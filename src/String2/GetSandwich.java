package String2;

public class GetSandwich {

	public String getSandwich(String str) {
		if (str.length() < 10) {
			return "";
		}
		int firstBreadIndex = str.indexOf("bread");
		int lastBreadIndex = str.lastIndexOf("bread");

		if (firstBreadIndex == -1 || lastBreadIndex == -1 || firstBreadIndex == lastBreadIndex) {
			return "";
		}
		return str.substring(firstBreadIndex + 5, lastBreadIndex);
	}
}
