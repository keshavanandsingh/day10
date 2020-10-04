package HotelReservation;

public class Hotel {
	private String name;
	private int regularRates;

	public Hotel() {
	}

	public Hotel(String name, int regularRates) {
		this.name = name;
		this.regularRates = regularRates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularRates() {
		return regularRates;
	}

	public void setRegularRates(int regularRates) {
		this.regularRates = regularRates;
	}
}
