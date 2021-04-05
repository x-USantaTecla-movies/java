package usantatecla.movies.v20;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		return 3;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}

}
