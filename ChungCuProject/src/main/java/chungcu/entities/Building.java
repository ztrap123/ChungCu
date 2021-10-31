package chungcu.entities;

public class Building {
	private int buildNumber;
	private String elevatorStatus;

	public Building() {

	}

	public Building(int buildNumber, String elevatorStatus) {

		this.buildNumber = buildNumber;
		this.elevatorStatus = elevatorStatus;
	}

	public String getElevatorStatus() {
		return elevatorStatus;
	}

	public void setElevatorStatus(String elevatorStatus) {
		this.elevatorStatus = elevatorStatus;
	}

	public int getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(int buildNumber) {
		this.buildNumber = buildNumber;
	}

}
