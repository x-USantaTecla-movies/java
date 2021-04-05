package usantatecla.movies.v13;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String title;
	
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		this.setPriceCode(priceCode);
	}
	
	public double getCharge(int daysRented) {
		double result = 0;
		switch (this.getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 1) * 1.5;
			}
			break;
		}
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else
			return 1;
	}
	
	public int getPriceCode() {
		return priceCode;
	}
	
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	public String getTitle() {
		return title;
	}
}
