package usantatecla.movies.v15;

public abstract class Price {

	abstract int getPriceCode();

	public double getCharge(int daysRented) {
		double result = 0;
		switch (this.getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 1) * 1.5;
			}
			break;
		}
		return result;
	}
}
