package com.skilldistillery.foodtrucks;

public class FoodTruck {

	// FIELDS

	private static int nextId = 0;
	private String name;
	private String foodType;
	private double rating;
	private int truckId;
	
	// METHODS

	public FoodTruck(String name, String foodType, double rating) { // constructor
		super();
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = nextId;
		nextId++;

	}

	public int getTruckId() { // getters and setters
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck [Name: " + name + ", Food Type: " + foodType + ", Rating: " + rating + ", ID: " + truckId + "]";
	}

	// ------------------------------------------------------------------



	
	

}
