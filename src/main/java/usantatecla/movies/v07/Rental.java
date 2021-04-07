package usantatecla.movies.v07;

public class Rental {

	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public double getCharge() {
		double result = 0;
		switch (this.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (this.getDaysRented() > 2) {
				result += (this.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (this.getDaysRented() > 3) {
				result += (this.getDaysRented() - 1) * 1.5;
			}
			break;
		}
		return result;
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
