import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCarMulti {

	RaceCar c;
	
	@Before
	public void bootCar() {
		c = new CarMulti("Chiron", 1.5, 100);
	}
	
	
	@Test //speed test
	public void testStopped() {
		assertEquals(0,c.getVelocity());
	}
	
	@Test // speed up test
	public void testVelocityOneTime() {
		c.speedUp();
		assertEquals(10,c.getVelocity());
	}
	
	@Test // speed up test
	public void testVelocityTwice() {
		c.speedUp();
		c.speedUp();
		assertEquals(15,c.getVelocity());
	}
	
	@Test // stop test
	public void testStop() {
		c.speedUp();
		c.stop();
		assertEquals(5,c.getVelocity());
	}
	
	@Test // test brake to zero
	public void testZero() {
		c.speedUp();
		c.stop();
		c.stop();
		c.stop();
		c.stop();
		assertEquals(0,c.getVelocity());
	}
	
	@Test // speed up test
	public void testSpeedMax() {
		for(int i=0; i<14; i++)
		c.speedUp();
		assertEquals(100,c.getVelocity());
	}

}
