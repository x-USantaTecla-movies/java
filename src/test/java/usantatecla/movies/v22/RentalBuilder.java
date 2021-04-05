package usantatecla.movies.v22;

public class RentalBuilder {

	private Movie movie;
	private int daysRented;
	
	public RentalBuilder movie(Movie movie) {
		this.movie = movie;
		return this;
	}
	
	public RentalBuilder daysRented(int daysRented) {
		this.daysRented = daysRented;
		return this;
	}
	
	public Rental build() {
		return new Rental(movie, daysRented);
	}
	
	
}
