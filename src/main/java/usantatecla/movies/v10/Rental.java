package usantatecla.movies.v10;

public class Rental {

	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public double getCharge() {
		return movie.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			return 2;
		else
			return 1;
	}
	
	public int getDaysRented() {
		return daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
}
