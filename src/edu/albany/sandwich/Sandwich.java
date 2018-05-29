package edu.albany.sandwich;

/**
 * Class that creates a sandwich consisting of 
 * a bread type and ingredients enum list
 */
public class Sandwich {

	private String breadType;
	private Ingredients ingredients[];
	
	/** Constructor that sets fields and copies Ingredients array
	 * @param breadType 
	 * @param list - array of Ingredients enum
	 */
	public Sandwich(String breadType, Ingredients[] list) {
		this.breadType = breadType;
		this.ingredients = new Ingredients[list.length];
		for(int i = 0; i < list.length; i++) {
			this.ingredients[i] = list[i];
		}
	}
	
	/*
	 * Override of the toString method
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("BreadType: " + breadType + " Ingredients: ");
		for(Ingredients i: ingredients) {
			buffer.append(i + " ");
		}
		return buffer.toString();
	}
}
