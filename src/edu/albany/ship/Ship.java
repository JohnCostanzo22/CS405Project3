package edu.albany.ship;

/**
 * A ship class that holds the name and yearbuilt of a ship
 */
public class Ship {

	private String name;
	private String yearBuilt;
	
	
	/** Constructor that sets fields
	 * @param name - name of ship
	 * @param year - year ship was built
	 */
	public Ship(String name, String year) {
		this.name = name;
		this.yearBuilt = year;
	}
	
	/** Accessor
	 * @return - name of ship
	 */
	public String getName() {
		return name;
	}

	/** Mutator
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/** Accessor
	 * @return - year ship was built
	 */
	public String getYearBuilt() {
		return yearBuilt;
	}

	/** Mutator
	 * @param yearBuilt
	 */
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	/* 
	 * Override of toString method
	 */
	public String toString() {
		return name + " built in " + yearBuilt;
	}
}
