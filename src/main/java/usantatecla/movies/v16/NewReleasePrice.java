package usantatecla.movies.v16;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int daysRented) {
		return 3;
	}

}
