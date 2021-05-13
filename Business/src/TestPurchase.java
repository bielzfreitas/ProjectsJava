import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPurchase {

	@Test
	void purchaseInCash() {
		Purchase p = new Purchase(500);
		assertEquals(1, p.getNumberPlots());
		assertEquals(500, p.getAmount());
		assertEquals(500, p.getValuePlot());
	}

	@Test
	void purchaseParceled() {
		Purchase p = new Purchase(4, 250);
		assertEquals(4, p.getNumberPlots());
		assertEquals(1000, p.getAmount());
		assertEquals(250, p.getValuePlot());
	}
}
