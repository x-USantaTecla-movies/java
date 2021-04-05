package usantatecla.movies.v18;

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
	
	public MovieBuilder childrens() {
		this.priceCode = Movie.CHILDRENS;
		return this;
	}
	
	public MovieBuilder regular() {
		this.priceCode = Movie.REGULAR;
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.priceCode = Movie.NEW_RELEASE;
		return this;
	}
	
	public Movie build() {
		return new Movie(title, priceCode);
	}
}
