package usantatecla.movies.v13;

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
		Iterator<Rental> rentals = this.rentals.iterator();
		String result = "Rental Record for " + this.getName() + "\n";
		while (rentals.hasNext()) {
			Rental each = rentals.next();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Iterator<Rental> rentals = this.rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getCharge();
		}
		return result;
	}
	
	public int getTotalFrequentRenterPoints() {
		int result = 0;
		Iterator<Rental> rentals = this.rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

}
