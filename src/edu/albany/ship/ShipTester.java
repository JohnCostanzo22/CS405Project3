package edu.albany.ship;
import edu.albany.cruise.CruiseShip;
import edu.albany.cargo.CargoShip;


/**
 * Tester class for Ship, CruiseShip, and CargoShip
 */
public class ShipTester {

	public static void main(String args[]) {
		
		Ship ships[] = new Ship[6];
		
		ships[0] = new Ship("ship1", "1990");
		ships[1] = new CruiseShip("cruise1", "2000", 100);
		ships[2] = new CargoShip("cargo1", "2010", 100);
		ships[3] = new Ship("ship2", "2000");
		ships[4] = new CruiseShip("cruise2", "2008", 525);
		ships[5] = new CargoShip("cargo2", "1840", 38);
		
		for(Ship ship: ships) {
			System.out.println(ship);
		}
	}
}
