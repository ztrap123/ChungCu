package chungcu.entities;

public class Apartment {
	private String id;
	private double apartmentPrice;
	private double electricBill;
	private double waterBill;
	private String status;
	private String type;

	public Apartment() {
		// TODO Auto-generated constructor stub
	}

	public Apartment(String id, double apartmentPrice, double electricBill, double waterBill, String status,
			String type) {
		this.id = id;
		this.apartmentPrice = apartmentPrice;
		this.electricBill = electricBill;
		this.waterBill = waterBill;
		this.status = status;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getApartmentPrice() {
		return apartmentPrice;
	}

	public void setApartmentPrice(double apartmentPrice) {
		this.apartmentPrice = apartmentPrice;
	}

	public double getElectricBill() {
		return electricBill;
	}

	public void setElectricBill(double electricBill) {
		this.electricBill = electricBill;
	}

	public double getWaterBill() {
		return waterBill;
	}

	public void setWaterBill(double waterBill) {
		this.waterBill = waterBill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
