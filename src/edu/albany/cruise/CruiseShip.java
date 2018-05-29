package edu.albany.cruise;
import edu.albany.ship.*;
/**
 * Class that extends ship and makes a cruiseShip that holds
 * name, year built, and max number passengers
 */
public class CruiseShip extends Ship {

	private int numOfPassengers;

	/** Constructor that calls super constructor and sets fields
	 * @param name
	 * @param year - year built
	 * @param numOfPassengers - max number of passengers
	 */
	public CruiseShip(String name, String year, int numOfPassengers) {
		super(name,year);
		this.numOfPassengers = numOfPassengers;
	}
	
	/** Accessor 
	 * @return max number of massengers
	 */
	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	/** Mutator
	 * @param numOfPassengers
	 */
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	
	/* 
	 * Override of toString method
	 */
	public String toString() {
		return this.getName() + " maximum number of people: " + numOfPassengers; 
	}
}
