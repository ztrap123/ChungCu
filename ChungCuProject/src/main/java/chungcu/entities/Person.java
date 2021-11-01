package chungcu.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
	private String fullName;
	private String address;
	private String sex;
	private LocalDate dob;
	private String license;
	private String birthplace;
	private String nationality;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String fullName, String address, String sex, LocalDate dob, String license, String birthplace,
			String nationality) {
		this.fullName = fullName;
		this.address = address;
		this.sex = sex;
		this.dob = dob;
		this.license = license;
		this.birthplace = birthplace;
		this.nationality = nationality;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(int d, int m, int y) {
		this.dob = LocalDate.of(y, m, d);
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String formatted() {
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatted = getDob().format(myFormat);
		return formatted;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", address=" + address + ", sex=" + sex + ", dob=" + formatted()
				+ ", license=" + license + ", birthplace=" + birthplace + ", nationality=" + nationality + "]";
	}

}
