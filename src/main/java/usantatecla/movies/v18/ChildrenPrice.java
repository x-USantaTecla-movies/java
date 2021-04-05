package usantatecla.movies.v18;

public class ChildrenPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 1) * 1.5;
		}
		return result;
	}

}
