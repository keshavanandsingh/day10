package com.hotelReservation;



public class Hotel {
	private String name;
	private int regularRate, weekendRate, ratings;

	public Hotel() {
	}

	public Hotel(String name, int regularRates, int weekedRate, int ratings) {
		this.name = name;
		this.regularRate = regularRates;
		this.weekendRate = weekedRate;
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularRates() {
		return regularRate;
	}

	public void setRegularRates(int regularRates) {
		this.regularRate = regularRates;
	}

	public int getWeekendRates() {
		return weekendRate;
	}

	public void setWeekendRates(int regularRates) {
		this.weekendRate = regularRates;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}
