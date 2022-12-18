package dec17_sample;




//Difference between interface and abstract class
//Interface will be implements keyword
//Abstract class using extends keyword
//Abstract class and Interface you cannot create object

public class FlightTicket extends AirIndia{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlightTicket cv = new FlightTicket();
		cv.xyz();
		AirIndia.rtc();
		//
	//	AirIndia cv1 = new AirIndia();
	
	}

	@Override
	void journey() {
		// TODO Auto-generated method stub
		//The logic here
	}

}
