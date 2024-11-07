package Logic1;

public class CaughtSpeeding {

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int limit = isBirthday ? 5 : 0;

		if (speed <= 60 + limit) {
			return 0;
		} else if (speed <= 80 + limit) {
			return 1;
		} else {
			return 2;
		}
	}

}
