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

	/**
	 * Sums all the boxes on the order.
	 * @return Integer Total number of boxes on order
	 */
	public int getTotalBoxes() {
		
		int numBoxes = 0;
		for(CookieOrder anOrder :this.orders) {
			numBoxes += anOrder.getNumBoxes();
		}
		
		return numBoxes;
	}

	/**
	 * Removes a variety from ArrayList
	 * @param Variety
	 */
	public void removeVariety(String variety) {
		
		for(CookieOrder anOrder: this.orders) {
			
			if(anOrder.getVariety() == variety) {
				this.orders.remove(anOrder);
			}
		}
	}

}
