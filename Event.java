import java.util.HashMap;

public class Event {
	String name, type, price, url, phoneNum, address, description, imageUrl;
	HashMap<String, String> hours;
	
	public Event(String name, String type, String price, String url, String phoneNum, String address,
					String description, String imageUrl, HashMap<String, String> hours) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.url = url;
		this.phoneNum = phoneNum;
		this.address = address;
		this.description = description;
		this.imageUrl = imageUrl;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public HashMap<String, String> getHours() {
		return hours;
	}

	public void setHours(HashMap<String, String> hours) {
		this.hours = hours;
	}
	
}
