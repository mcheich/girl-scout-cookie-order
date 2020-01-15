package cookiesJUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cookies.CookieOrder;

class CookieOrderTest {

	@Test
	void CookieOrderGetterMethedReturnsString() {
		//Arrange
		CookieOrder underTest = new CookieOrder("Thin Mints");
		//Act
		String result = underTest.getVariety();
		//Assert
		assertEquals("Thin Mints", result);
	}

}
