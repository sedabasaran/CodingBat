package Logic1;

public class CigarParty {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend && cigars >= 40) {
			return true;
		} else if (!isWeekend && cigars >= 40 && cigars <= 60) {
			return true;
		} else {
			return false;
		}
	}

}
