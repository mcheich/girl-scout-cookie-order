package cookies;

import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {
		
		//Setup Orders
		CookieOrder order1 = new CookieOrder("Thin Mints", 7);
		CookieOrder order2 = new CookieOrder("Tagalongs", 5);
		CookieOrder order3 = new CookieOrder("Samoas", 12);
		CookieOrder order4 = new CookieOrder("Thin Mints", 2);
		
		//Create master order
		MasterOrder anOrder = new MasterOrder();
		
		//Add orders to master
		anOrder.addOrder(order1);
		anOrder.addOrder(order2);
		anOrder.addOrder(order3);
		anOrder.addOrder(order4);
		
		//Display current order and total number of boxes
		System.out.println("Current Order");
		anOrder.showOrder();
		System.out.println("\nYou have ordered " + anOrder.getTotalBoxes() + " boxes\n");
		
		//Remove Order
		System.out.println("What would you like to remove? (specify a variety or none)");
		Scanner input = new Scanner(System.in);
		String removal = input.nextLine();
		System.out.println("You are removing " + anOrder.getVarietyBoxes(removal) + " boxes of " + removal);
		anOrder.removeVariety(removal);

		//Display current order and total number of boxes
		System.out.println("Current Order");
		anOrder.showOrder();
		
		input.close();
	}

}
