package cookies;

import java.util.ArrayList;

public class MasterOrder {
	
	private ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();
	/**
	 * Empty Constructor...
	 * 
	 * Why bother?
	 */
	public MasterOrder() {
		
	}
	
	/**
	 * Adds an order to the orders list
	 * @param order
	 */
	public void addOrder(CookieOrder theOrder) {
		
		this.orders.add(theOrder);
		
	}

	public ArrayList<CookieOrder> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<CookieOrder> orders) {
		this.orders = orders;
	}

}
