 package Dec4;

import java.util.ArrayList;
import java.util.Collections;

public class MainImplementing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Courier c1 = new Courier(1,30,300);
		Courier c2 = new Courier(2,10,200);
		Courier c3 = new Courier(3,40,500);
		Courier c4 = new Courier(4,20,500);
		
		ArrayList<Courier> cv= new ArrayList<Courier>();
		cv.add(c1);
		cv.add(c2);
		cv.add(c3);
		cv.add(c4);
		
		Collections.sort(cv);  
		
		
		for(Courier st:cv){  
			System.out.println(st.getCourierdimesion()+" "+st.getCourierId()+" "+st.getWeight());  
			}  
	}

}
