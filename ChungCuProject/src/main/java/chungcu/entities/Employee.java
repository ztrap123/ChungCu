package chungcu.entities;

import java.time.LocalDate;

public class Employee extends Person {
	private String position;
	private String id;
	private LocalDate appointDay;

	public Employee() {
	}

	public Employee(String position, String id, LocalDate appointDay, String fullName, String address, String sex,
			LocalDate dob, String license, String birthplace, String nationality) {
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

	public LocalDate getAppointDay() {
		return appointDay;
	}

	public void setAppointDay(int d, int m, int y) {
		this.appointDay = LocalDate.of(y, m, d);
	}

}
