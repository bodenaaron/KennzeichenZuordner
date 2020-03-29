package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
	public int id;
	public String lastName;
	public String firstName;
	public Address address;
	public Set<Plate> plates;

	public Person(){

	}
	public Person(String lastName, String firstName, Address address, Set<Plate> plates){
		this.lastName=lastName;
		this.firstName=firstName;
		this.address=address;
		this.plates=plates;
	}
	public Person(String lastName, String firstName, Address address, Plate plate){
		this.lastName=lastName;
		this.firstName=firstName;
		this.address=address;
		this.plates= new HashSet<Plate>();
		this.plates.add(plate);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Plate> getPlates() {
		return plates;
	}
	public void setPlates(Set<Plate> plates) {
		this.plates = plates;
	}
	
	
}
