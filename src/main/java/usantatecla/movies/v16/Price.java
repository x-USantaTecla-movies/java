package usantatecla.movies.v16;

public abstract class Price {

	abstract int getPriceCode();

	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else
			return 1;
	}
}
