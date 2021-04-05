package usantatecla.movies.v20;

public class ChildrenPrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 1) * 1.5;
		}
		return result;
	}

}
