package edu.albany.sandwich;

/**
 * A cashier takes a customers order, receives payment from the customer,
 * has the sandwichMaker make the order and then gives the customer the sandwich
 */
public class Cashier {

	private double orderTotal;
	
	/** gets the order from the customer, gets payment, has SandwichMaker maker make the
	 * order and then gives it to the customer
	 * @param customer - the customer who is ordering
	 */
	public void getOrder(Customer customer) {
		//set orderTotal
		this.getTotal(customer);
		System.out.printf("Your total is %.2f\n", orderTotal);
		//if the customer payment = orderTotal then make and give sandwich
		if(customer.payment(orderTotal) == orderTotal) {
			//make the sandwich
			SandwichMaker make = new SandwichMaker(customer.getIngredientsOrder(), customer.getBreadOrder());
			//give the sandwich
			customer.giveSandwich(make.getSandwich());
			System.out.println("Here is your sandwich");
			//print the sandwich
			System.out.println(make.getSandwich() + "\n");
		} else {
			//if payment != orderTotal then customer does not get sandwich
			System.out.println("You will get no sandwich\n");
		}
	}
	
	/** Adds up the total cost of ingredients in customers
	 * order and then adds a $2 charge on top. The result
	 * is saved in orderTotal
	 * @param customer
	 */
	public void getTotal(Customer customer) {
		//clear out any previous orders
		orderTotal = 0;
		for(Ingredients i: customer.getIngredientsOrder()) {
			orderTotal += i.getPrice();
		}
		orderTotal += 2.00;
	}
}
