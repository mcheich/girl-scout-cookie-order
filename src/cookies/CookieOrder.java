package cookies;

public class CookieOrder {

	private String variety;
	private int numBoxes;
	
	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}
	
	/**
	 * Getter Method.
	 * @return String
	 */
	public String getVariety() {
		return this.variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

}
