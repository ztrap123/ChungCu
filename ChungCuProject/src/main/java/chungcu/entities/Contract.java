package chungcu.entities;

import java.util.Date;

public class Contract {
	private Date startday;
	private Date endday;
	private String hoh_license;
	private String apartment_id;

	public Contract() {
		// TODO Auto-generated constructor stub
	}

	public Contract(Date startday, Date endday, String hoh_license, String apartment_id) {
		super();
		this.startday = startday;
		this.endday = endday;
		this.hoh_license = hoh_license;
		this.apartment_id = apartment_id;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public Date getEndday() {
		return endday;
	}

	public void setEndday(Date endday) {
		this.endday = endday;
	}

	public String getHoh_license() {
		return hoh_license;
	}

	public void setHoh_license(String hoh_license) {
		this.hoh_license = hoh_license;
	}

	public String getApartment_id() {
		return apartment_id;
	}

	public void setApartment_id(String apartment_id) {
		this.apartment_id = apartment_id;
	}

}
