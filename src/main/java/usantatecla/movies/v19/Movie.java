package usantatecla.movies.v19;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String title;
	
	private Price price;
	
	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
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
	
	public void setPriceCode(Price price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
}
