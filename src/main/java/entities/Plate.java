package entities;

import java.util.List;
import java.util.Set;

public class Plate {

	public String plate;	
	public Set<Appearance> appearances;
	public int id;

	public Plate(String plate, Set<Appearance> appearances){
		this.plate=plate;
		this.appearances=appearances;
	}
	public Plate(String plate){
		this.plate=plate;
	}
	public Plate(){

	}

	public void addAppearance(Appearance appearance){
		this.appearances.add(appearance);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public Set<Appearance> getAppearances() {
		return appearances;
	}
	public void setAppearances(Set<Appearance> appearances) {
		this.appearances = appearances;
	}
	
}
