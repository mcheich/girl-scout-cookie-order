package cookiesJUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cookies.CookieOrder;

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

}
