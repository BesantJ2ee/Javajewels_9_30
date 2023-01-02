package project;

import java.time.LocalDateTime;

public class Entry {
	
	private Integer Vehiclenumber;
	
	private LocalDateTime laocalTime;

	public Integer getVehiclenumber() {
		return Vehiclenumber;
	}

	public void setVehiclenumber(Integer vehiclenumber) {
		Vehiclenumber = vehiclenumber;
	}

	public LocalDateTime getLaocalTime() {
		return laocalTime;
	}

	public void setLaocalTime(LocalDateTime laocalTime) {
		this.laocalTime = laocalTime;
	}

}
