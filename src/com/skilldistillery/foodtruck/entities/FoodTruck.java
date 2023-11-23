package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public String toString() {
		String description = "Name: " + name + ", Serves: " + foodType + ", Rating: " + rating;
		return description;
	}
	
}
