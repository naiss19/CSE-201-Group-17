import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class EventTester {

	@Test
	public void testEvent() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("name", e1.getName());
		assertEquals("type", e1.getType());
		assertEquals("price", e1.getPrice());
		assertEquals("url", e1.getUrl());
		assertEquals("phoneNum", e1.getPhoneNum());
		assertEquals("address", e1.getAddress());
		assertEquals("description", e1.getDescription());
		assertEquals("imageUrl", e1.getImageUrl());
		assertEquals(hours, e1.getHours());
		
	}

	@Test
	public void testGetName() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("name", e1.getName());
	}

	@Test
	public void testSetName() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event(null, "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals(null, e1.getName());
		e1.setName("name");
		assertEquals("name", e1.getName());
	}

	@Test
	public void testGetType() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("type", e1.getType());
	}

	@Test
	public void testSetType() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", null, "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals(null, e1.getType());
		e1.setType("type");
		assertEquals("type", e1.getType());
	}

	@Test
	public void testGetPrice() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("price", e1.getPrice());
	}

	@Test
	public void testSetPrice() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", null, "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals(null, e1.getPrice());
		e1.setPrice("price");
		assertEquals("price", e1.getPrice());
	}

	@Test
	public void testGetUrl() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("url", e1.getUrl());
	}

	@Test
	public void testSetUrl() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", null, "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals(null, e1.getUrl());
		e1.setUrl("url");
		assertEquals("url", e1.getUrl());
	}

	@Test
	public void testGetPhoneNum() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("phoneNum", e1.getPhoneNum());
	}

	@Test
	public void testSetPhoneNum() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", null, "address", "description", "imageUrl", hours);
		assertEquals(null, e1.getPhoneNum());
		e1.setPhoneNum("phoneNum");
		assertEquals("phoneNum", e1.getPhoneNum());
	}

	@Test
	public void testGetAddress() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("address", e1.getAddress());
	}

	@Test
	public void testSetAddress() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", null, "description", "imageUrl", hours);
		assertEquals(null, e1.getAddress());
		e1.setAddress("address");
		assertEquals("address", e1.getAddress());
	}

	@Test
	public void testGetDescription() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("description", e1.getDescription());
	}

	@Test
	public void testSetDescription() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", null, "imageUrl", hours);
		assertEquals(null, e1.getDescription());
		e1.setDescription("description");
		assertEquals("description", e1.getDescription());
	}

	@Test
	public void testGetImageUrl() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals("imageUrl", e1.getImageUrl());
	}

	@Test
	public void testSetImageUrl() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", null, hours);
		assertEquals(null, e1.getImageUrl());
		e1.setImageUrl("imageUrl");
		assertEquals("imageUrl", e1.getImageUrl());
	}

	@Test
	public void testGetHours() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", hours);
		assertEquals(hours, e1.getHours());
	}

	@Test
	public void testSetHours() {
		HashMap<String, String> hours = new HashMap<String, String>();
		Event e1 = new Event("name", "type", "price", "url", "phoneNum", "address", "description", "imageUrl", null);
		assertEquals(null, e1.getHours());
		e1.setHours(hours);
		assertEquals(hours, e1.getHours());
	}

}
