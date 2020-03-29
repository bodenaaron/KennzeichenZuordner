package entities;

import java.util.Set;

public class Address {
	public int id;
	public String street;
	public int number;
	public String additional;
	public String postcode;
	public String city;
	
	public Address(String street, int number, String postcode, String city) {
		this.street= street;
		this.number = number;
		this.postcode = postcode;
		this.city=city;
	}
	public Address(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public String getAdditional() {
		return additional;
	}
}
