package usantatecla.movies.v17;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int daysRented) {
		return 3;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2: 1;
	}

}
