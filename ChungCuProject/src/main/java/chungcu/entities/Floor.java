package chungcu.entities;

public class Floor {
	private int floorNumber;
	private boolean emexit;
	private boolean camera;
	private boolean firealarm;

	public Floor() {

	}

	public Floor(int floorNumber, boolean emexit, boolean camera, boolean firealarm) {
		this.floorNumber = floorNumber;
		this.emexit = emexit;
		this.camera = camera;
		this.firealarm = firealarm;
	}

	public boolean isEmexit() {
		return emexit;
	}

	public void setEmexit(boolean emexit) {
		this.emexit = emexit;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isFirealarm() {
		return firealarm;
	}

	public void setFirealarm(boolean firealarm) {
		this.firealarm = firealarm;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

}
