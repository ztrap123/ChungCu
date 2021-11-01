package chungcu.entities;

import java.time.LocalDate;

public class Citizen extends Person {
	private String id;
	private boolean hoh;

	public Citizen() {

	}

	public Citizen(String id, boolean hoh, String fullName, String address, String sex, LocalDate dob, String license,
			String birthplace, String nationality) {
		super(fullName, address, sex, dob, license, birthplace, nationality);
		this.id = id;
		this.hoh = hoh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isHoh() {
		return hoh;
	}

	public void setHoh(boolean hoh) {
		this.hoh = hoh;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", hoh=" + hoh + super.toString() + "]";
	}

}
