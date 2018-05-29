package edu.albany.cargo;
import edu.albany.ship.Ship;

/**
 * Class that extends ship. Holds a name, year built, and capacity in tons
 */
public class CargoShip extends Ship {

	private int tonnageCapacity;
	
	/**
	 * Constructor that calls super constructor and sets fields
	 * @param name
	 * @param year
	 * @param tonnageCapacity
	 */
	public CargoShip(String name, String year, int tonnageCapacity) {
		super(name,year);
		this.tonnageCapacity = tonnageCapacity;
	}
	
	/** Accessor
	 * @return the capacity in tons
	 */
	public int getTonnageCapacity() {
		return tonnageCapacity;
	}

	/** Mutator
	 * @param tonnageCapacity
	 */
	public void setTonnageCapacity(int tonnageCapacity) {
		this.tonnageCapacity = tonnageCapacity;
	}

	/* 
	 * Override of toString method
	 */
	public String toString() {
		return this.getName() + " cargo capacity in tons: " + this.tonnageCapacity;
	}
}
