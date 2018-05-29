package edu.albany.sandwich;

/**
 * Enum for ingredients and their price in a sandwich
 */
public enum Ingredients {

	LETTUCE(0.25),
	ONION(0.40),
	CHICKEN(2.00),
	TURKEY(1.75),
	TOMATO(0.30);
	
	//the price of the ingredient
	private double price;
	
	//Constructor
	Ingredients(double price) {
		this.price = price;
	}
	
	//Accessor
	public double getPrice() {
		return this.price;
	}
}
