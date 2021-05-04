import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BlackBoxTest {

//	@Test
//	void testBuildCatalogue() {
//		fail("Not yet implemented");
//	}

	@Test
	void testBuildEvents() {
		ArrayList<Entry> a = Catalogue.buildEvents(-1);
		assertEquals(a.get(0).name, "Brick Street");
		assertEquals(a.get(9).name, "Hueston Woods");
		assertTrue(a.size() == 10);
	}
	
	@Test
	void testAddHash() {
		Entry e = new Entry("Brick Street","Bar", "$$", true);
		assertTrue(e.addHash().size() == 7);
	}

	
	@Test
	void testImages() {
	
//		EventPanelOOP2 e = new EventPanelOOP2();
	}

}
