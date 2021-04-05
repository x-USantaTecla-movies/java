package usantatecla.movies.v03;

public class MovieBuilder {

	private String title;
	private int priceCode;
	
	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder priceCode(int priceCode) {
		this.priceCode = priceCode;
		return this;
	}
	
	public Movie build() {
		return new Movie(title, priceCode);
	}
}
