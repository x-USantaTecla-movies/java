package usantatecla.movies.v01;

class MovieBuilder {

	private String title;
	private int priceCode;

	MovieBuilder() {
		title = "movieName";
	}

	MovieBuilder title(String title) {
		this.title = title;
		return this;
	}

	MovieBuilder priceCode(int priceCode) {
		this.priceCode = priceCode;
		return this;
	}

	Movie build() {
		return new Movie(title, priceCode);
	}

}
