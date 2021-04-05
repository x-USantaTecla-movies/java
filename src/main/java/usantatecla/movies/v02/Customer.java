package usantatecla.movies.v02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals;
	
	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}
	
	public String getName() {
		return name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = this.rentals.iterator();
		String result = "Rental Record for " + this.getName() + "\n";
		while (rentals.hasNext()) {
			double thisAmount = 0;
			Rental each = rentals.next();
			
			thisAmount = this.amountFor(each);
			
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
				each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
	
	private double amountFor(Rental each) {
		double thisAmount = 0;
		switch (each.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			thisAmount += 2;
			if (each.getDaysRented() > 2) {
				thisAmount += (each.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			thisAmount += 3;
			break;
		case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (each.getDaysRented() > 3) {
				thisAmount += (each.getDaysRented() - 1) * 1.5;
			}
			break;
		}
		return thisAmount;
	}
	
	
}
