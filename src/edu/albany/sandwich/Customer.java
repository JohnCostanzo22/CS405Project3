package edu.albany.sandwich;

/**
 * A customer has a certian amount of money available, a breadtype and ingredients list for their sandwich order,
 * and can have a sandwich
 */
public class Customer {

	private double moneyAvailable;
	private Sandwich sandwich;
	private String breadTypeOrder;
	private Ingredients order[];
	
	/** Constructor that sets fields
	 * @param money - amount of money that the customer has
	 * @param breadTypeOrder
	 * @param order - Ingredients list
	 */
	public Customer(double money, String breadTypeOrder, Ingredients order[]) {
		this.moneyAvailable = money;
		this.breadTypeOrder = breadTypeOrder;
		int orderLength;
		//Only allowed max of 10 ingredients
		if(order.length > 10) {
			orderLength = 10;
		}
		else {
			orderLength = order.length;
		}
		//copy ingredients into this.order array
		this.order = new Ingredients[orderLength];
		for(int i = 0; i < orderLength; i++) {
			this.order[i] = order[i];
		}
	}
	
	/** Gives the customer a sandwich
	 * @param sandwich
	 */
	public void giveSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	/** Accessor
	 * @return the bread Type 
	 */
	public String getBreadOrder() {
		return breadTypeOrder;
	}
	
	/** Accessor
	 * @return the Ingredients array
	 */
	public Ingredients[] getIngredientsOrder() {
		return order;
	}
	
	/** Pays the given amount and deducts from the moneyAvailable
	 * @param total
	 * @return the amount payed or 0 if there is not enough moneyAvailable
	 */
	public double payment(double total) {
		if(moneyAvailable >= total) {
			moneyAvailable -= total;
			System.out.printf("Here is %.2f\n", total);
			return total;
		}
		//cant get sandwich
		System.out.println("I dont have enough");
		return 0;
	}
}
