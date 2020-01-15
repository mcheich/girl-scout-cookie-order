package cookiesJUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cookies.CookieOrder;
import cookies.MasterOrder;

class CookieOrderTest {

	@Test
	void CookieOrderGetterMethodReturnsStringThinMints() {
		//Arrange
		CookieOrder underTest = new CookieOrder("Thin Mints", 1);
		//Act
		String result = underTest.getVariety();
		//Assert
		assertEquals("Thin Mints", result);
	}
	
	@Test
	void CookieOrderGetterMethodReturnsInteger7() {
		//Arrange
		CookieOrder underTest = new CookieOrder("Thin Mints", 7);
		//Act
		int result = underTest.getNumBoxes();
		//Assert
		assertEquals(7, result);
	}
	
	@Test
	void addOrderAddsanOrderToTheArrayList() {
		//Arrange
		CookieOrder order = new CookieOrder("Thin Mints", 7);
		MasterOrder underTest = new MasterOrder();
		//Act
		underTest.addOrder(order);
		//Assert
		assertTrue(underTest.getOrders().contains(order));
	}
	
	@Test
	void getTotalBoxesAddsUpTo12() {
		//Arrange
		CookieOrder order1 = new CookieOrder("Thin Mints", 7);
		CookieOrder order2 = new CookieOrder("Tagalongs", 5);
		MasterOrder underTest = new MasterOrder();
		//Act
		underTest.addOrder(order1);
		underTest.addOrder(order2);
		int result = underTest.getTotalBoxes();
		//Assert
		assertEquals(12, result);
	}

	@Test
	void removeVarietyremovesThinMints() {
		//Arrange
		CookieOrder order1 = new CookieOrder("Thin Mints", 7);
		CookieOrder order2 = new CookieOrder("Tagalongs", 5);
		MasterOrder underTest = new MasterOrder();
		//Act
		underTest.addOrder(order1);
		underTest.addOrder(order2);
		underTest.removeVariety("Thin Mints");
		//Assert
		assertFalse(underTest.getOrders().contains(order1));
	}
	/**
	 * Not sure if/what/how to test drive an empty constructor.
	 * This didn't work.
	 */
//	@Test
//	void MasterOrderConstructorReturnsAMasterOrderObject() {
//		//Arrange
//		MasterOrder underTest = new MasterOrder();
//		//Act
//		assertEquals("class cookies.MasterOrder", underTest.getClass());
//	}

}
