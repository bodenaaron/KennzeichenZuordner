package entities;

import javax.swing.*;
import java.util.Date;

public class Appearance {

	public int id;
	public Date dateOfApp;
	public String location;
	public String photo;
	public Plate plate;

	public Appearance(Date dateOfApp, String location, String photo, Plate plate){
		this.plate=plate;
		this.dateOfApp=dateOfApp;
		this.location=location;
		this.photo=photo;
		this.plate=plate;
	}
	public Plate getPlate() {
		return plate;
	}

	public void setPlate(Plate plate) {
		this.plate = plate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateOfApp() {
		return dateOfApp;
	}
	public void setDateOfApp(Date dateOfApp) {
		this.dateOfApp = dateOfApp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
