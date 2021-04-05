package usantatecla.movies.v19;

public class MovieBuilder {

	private String title;
	
	private Price price;
	
	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
//	public MovieBuilder priceCode(int priceCode) {
//		this.priceCode = priceCode;
//		return this;
//	}
	
	public MovieBuilder childrens() {
		this.price = new ChildrenPrice();
		return this;
	}
	
	public MovieBuilder regular() {
		this.price = new RegularPrice();
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.price = new NewReleasePrice();
		return this;
	}
	
	public Movie build() {
		return new Movie(title, price);
	}
}
