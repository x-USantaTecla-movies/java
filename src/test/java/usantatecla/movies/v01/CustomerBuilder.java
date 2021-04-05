package usantatecla.movies.v01;

import java.util.ArrayList;
import java.util.List;

class CustomerBuilder {

	private String name;
	private List<Rental> rentals;

	CustomerBuilder() {
		rentals = new ArrayList<Rental>();
	}

	CustomerBuilder name(String name) {
		this.name = name;
		return this;
	}

	CustomerBuilder rental(Rental rental) {
		rentals.add(rental);
		return this;
	}

	Customer build() {
		Customer customer = new Customer(name);
		for (Rental rental : rentals) {
			customer.addRental(rental);
		}
		return customer;
	}

}
