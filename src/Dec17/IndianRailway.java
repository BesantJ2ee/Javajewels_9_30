package Dec17;

import java.util.LinkedList;
import java.util.List;

public class IndianRailway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a1 = new LinkedList<String>();
		
	//	SouthWesternRailway s1 = new SouthWesternRailway();
	//	SouthWesternRailway s2 = new SouthWesternRailway(a1);
	//	SouthWesternRailway s3 = new SouthWesternRailway(10,20);
		
		//Constructor chaiing
		//one constructor is calling another
		//that constructor calling another constructor
		//we have to use this keyword
		WesternRailway w1 = new WesternRailway(10);
		w1.cfg();
		
		
	}

}
