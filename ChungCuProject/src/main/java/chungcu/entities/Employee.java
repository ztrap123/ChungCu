package chungcu.entities;

import java.util.Date;

public class Employee extends Person {
	private String position;
	private String id;
	private Date appointDay;

	public Employee() {
	}

	public Employee(String position, String id, Date appointDay, String fullName, String address, String sex, Date dob,
			String license, String birthplace, String nationality) {
		super(fullName, address, sex, dob, license, birthplace, nationality);
		this.position = position;
		this.id = id;
		this.appointDay = appointDay;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getAppointDay() {
		return appointDay;
	}

	public void setAppointDay(Date appointDay) {
		this.appointDay = appointDay;
	}

}
