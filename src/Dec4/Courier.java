package Dec4;

import java.io.*;
import java.util.*;
//we are modifying the pojo class
class Courier implements Comparable<Courier> {

	private int courierId;

	private int weight;

	private int courierdimesion;

	public Courier(int courierId, int weight, int courierdimesion) {
		super();
		this.courierId = courierId;
		this.weight = weight;
		this.courierdimesion = courierdimesion;
	}

	@Override
	public int compareTo(Courier o) {
		// TODO Auto-generate qd method stub
		//Reverse Order
		
		if (weight < o.getWeight()) {
			return 1;
		}

		else if (weight > o.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}
	
/*	@Override
	public int compareTo(Courier o) {
		// TODO Auto-generate qd method stub
		//Ascending Order
		
		if (weight > o.getWeight()) {
			return 1;
		}

		else if (weight < o.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}*/

	public int getCourierdimesion() {
		return courierdimesion;
	}

	public void setCourierdimesion(int courierdimesion) {
		this.courierdimesion = courierdimesion;
	}

	public int getCourierId() {
		return courierId;
	}

	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
