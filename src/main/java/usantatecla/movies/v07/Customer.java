package usantatecla.movies.v07;

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
			Rental each = rentals.next();
			
			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
	
}
