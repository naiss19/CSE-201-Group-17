import static org.junit.Assert.*;

import java.awt.Component;

import org.junit.Test;

public class EntryTester {

	@Test
	public void testEntry() {
		boolean red = true;
		Entry e1 = new Entry("name", "type", "dollar", red);
		assertEquals(9, e1.getComponentCount());
		assertEquals(255, e1.getBackground().getAlpha());
		assertEquals(192, e1.getBackground().getGreen());
		assertEquals(203, e1.getBackground().getBlue());
	}
}
