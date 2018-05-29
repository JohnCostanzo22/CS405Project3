package edu.albany.sandwich;

/**
 * Tester for all classes in the package
 */
public class SandwichDriver {

	public static void main(String[] args) {
		//create ingredients list
		Ingredients list[] = new Ingredients[4];
		list[0] = Ingredients.LETTUCE;
		list[1] = Ingredients.CHICKEN;
		list[2] = Ingredients.ONION;
		list[3] = Ingredients.TOMATO;
		
		//create customer and cashier
		Customer customer = new Customer(5.00, "Wrap", list);
		Cashier cashier = new Cashier();
		
		//customer orders twice
		cashier.getOrder(customer);
		//second order deos not have enough money
		cashier.getOrder(customer);
		
		//new customer that orders without enough money
		Customer customer2 = new Customer(2.00, "Italian", list);
		cashier.getOrder(customer2);
	}

}
