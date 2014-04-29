//Address.java
//FILE COMPLETE

public class Address {
	public String street;
	public String city;
	public String state;
	public String zipCode;

	public Address(String street, String city, String state, String zipCode) {
		this.state = state;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Address() {
		this.state = "";
		this.street = "";
		this.city = "";
		this.zipCode = "";
	}

}
