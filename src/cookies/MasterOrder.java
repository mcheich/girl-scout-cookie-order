package cookies;

import java.util.ArrayList;
import java.util.Iterator;

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
	 * 
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
	 * 
	 * @return Integer Total number of boxes on order
	 */
	public int getTotalBoxes() {

		int numBoxes = 0;
		for (CookieOrder anOrder : this.orders) {
			numBoxes += anOrder.getNumBoxes();
		}

		return numBoxes;
	}

	/**
	 * Removes a variety from ArrayList
	 * 
	 * @param Variety
	 */
	public void removeVariety(String variety) {

		// for (CookieOrder anOrder : this.orders) {
		Iterator<CookieOrder> itr = this.orders.iterator();
		while (itr.hasNext()) {
			if (itr.next().getVariety().equals(variety)) {
				itr.remove();
				// System.out.println("###removeVariety Flag###");
			}
		}
	}

	/**
	 * 
	 * @param variety
	 * @return Number of boxes of a specific variety
	 */
	public int getVarietyBoxes(String variety) {

		int numBoxes = 0;
		for (CookieOrder anOrder : this.orders) {

			if (anOrder.getVariety().equals(variety)) {
				numBoxes += anOrder.getNumBoxes();
			}
		}
		return numBoxes;
	}

	/**
	 * Displays the orders to the console by variety and number of boxes
	 */
	public void showOrder() {

		for (CookieOrder anOrder : this.orders) {
			System.out.println("Variety: " + anOrder.getVariety() + "  Boxes: " + anOrder.getNumBoxes());
		}
	}

}
