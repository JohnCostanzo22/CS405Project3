package edu.albany.sandwich;

/**
 * Makes a sandwich out of the order. Can only make one sandwich.
 * A new sandwich maker must be created for each sandwich similar
 * to a new pair of gloves being needed for each sandwich order
 */
public class SandwichMaker {

	private Sandwich sandwich;
	
	/**  Constructor that creates a sandwich from the order
	 * @param order - Ingredients enum array
	 * @param breadType
	 */
	public SandwichMaker(Ingredients order[], String breadType) {
		this.sandwich = new Sandwich(breadType, order);
	}
	
	/** Accessor
	 * @return the sandwich
	 */
	public Sandwich getSandwich() {
		return sandwich;
	}
}
