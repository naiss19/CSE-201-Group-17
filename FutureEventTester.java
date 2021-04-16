import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class FutureEventTester {

	@Test
	public void testCOVIDInfo() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("Brick Street", "Bar", "$$", "https://brickstreetoxford.com/",
				"(513)280-6341", "36 E. High Street Oxford, Ohio 45056", "Enjoy a night out "
						+ "in Oxford! Whether it’s Karaoke Night, Game Day, or Beat the Clock,"
						+ " Brick Street is the place to be.", "imageUrl", hours);
		assertTrue(e1.getDescription().contains("COVID"));
	}
}
