package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.List;

public class StatementBuilder {
	
	private String customerName;
	private List<String> movieNames;
	private List<Double> amounts;
	private double totalAmount = 0;
	private int frequentRenterPoints = 0;
	
	public StatementBuilder() {
		movieNames = new ArrayList<String>();
		amounts = new ArrayList<Double>();
	}
	
	public StatementBuilder customerName(String customerName) {
		this.customerName = customerName;
		return this;
	}
	
	public StatementBuilder movie(String movieName, double amount) {
		movieNames.add(movieName);
		amounts.add(amount);
		return this;
	}
	
	public StatementBuilder totalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	} 
	
	public StatementBuilder frequentRenterPoints(int frequentRenterPoints) {
		this.frequentRenterPoints = frequentRenterPoints;
		return this;
	}
	
	public String build() {
		String result = "Rental Record for " + customerName + "\n";
		for(int i=0; i<movieNames.size(); i++) {
			result += "\t" + movieNames.get(i) + "\t" + amounts.get(i) + "\n";
		}
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints + " frequent renter points";
		return result;
	}
	

}
