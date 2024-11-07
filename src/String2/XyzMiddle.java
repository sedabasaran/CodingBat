package String2;

public class XyzMiddle {

	public boolean xyzMiddle(String str) {
		int xyzIndex = str.indexOf("xyz");
		if (xyzIndex == -1) {
			return false;
		}
		while (xyzIndex != -1) {
			int leftLength = xyzIndex;
			int rightLength = str.length() - (xyzIndex + 3);

			if (Math.abs(leftLength - rightLength) <= 1) {
				return true;
			}
			xyzIndex = str.indexOf("xyz", xyzIndex + 1);
		}
		return false;
	}

}
