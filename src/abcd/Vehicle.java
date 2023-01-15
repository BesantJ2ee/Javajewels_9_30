package abcd;

import java.sql.Date;

public class Vehicle {

	private int number;
	
	private Date minutes;
	
	private Integer contactNumber;
	
	private int typeOfVehicle;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(int typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public Date getMinutes() {
		return minutes;
	}

	public void setMinutes(Date minutes) {
		this.minutes = minutes;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
