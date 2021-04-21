import java.util.HashMap;

/**
 * This is the Event class that creates objects for each event that will store all of its values as listed in the data file
 * @author Zach Katz, Brandon Hall, Hannah Ahlstrom
 * 
 */
public class Event {
	String name, type, price, url, phoneNum, address, description, imageUrl;
	HashMap<String, String> hours;
	
	/**
	 * This is the Event contructor that takes all of the elements needed to display the EventPanel
	 * @param String name
	 * @param String type
	 * @param String price
	 * @param String url
	 * @param String phoneNum
	 * @param String address
	 * @param String description
	 * @param String imageUrl
	 * @param HashMap<String, String> hours
	 *
	 */
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

	/**
	 * The getter method for the Event name
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * The setter method for the Event name
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The getter method for the Event type
	 * @return String type
	 */
	public String getType() {
		return type;
	}

	/**
	 * The setter method for the Event type
	 * @param String type
	 */
	public void setType(String type) {
		this.type = type;
	}
 
	/**
	 * The getter method for the Event price
	 * @return String price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * The setter method for the Event price
	 * @param String price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * The getter method for the Event url
	 * @return String url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * The setter method for the Event url
	 * @param String url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * The getter method for the Event phone number
	 * @return String phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * The setter method for the Event phone number
	 * @param String phoneNum
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * The getter method for the Event address
	 * @return String address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * The setter method for the Event address
	 * @param String address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * The getter method for the Event description
	 * @return String description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * The setter method for the Event description
	 * @param String description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The getter method for the Event image url
	 * @return String imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * The setter method for the Event image url
	 * @param String imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * The getter method for the Event hours
	 * @return HashMap<String, String> hours
	 */
	public HashMap<String, String> getHours() {
		return hours;
	}

	/**
	 * The setter method for the Event hours
	 * @param HashMap<String, String> hours
	 */
	public void setHours(HashMap<String, String> hours) {
		this.hours = hours;
	}
	
}
