package usantatecla.movies.v16;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String title;
	
	Price price;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		this.setPriceCode(priceCode);
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
	
	public int getPriceCode() {
		return price.getPriceCode();
	}
	
	public void setPriceCode(int priceCode) {
		switch(priceCode) {
		case Movie.CHILDRENS:
			price = new ChildrenPrice();
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
}
