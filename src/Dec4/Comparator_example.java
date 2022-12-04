package Dec4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class a implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId())
		{
			return 1;
			
		}else if(o1.getId()<o2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}






public class Comparator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee c1 = new Employee();
			c1.setId(0);
			c1.setName("Xyz");
			
			Employee c2 = new Employee();
			c2.setId(2);
			c2.setName("Xyzfgg");
			
			
			Employee c3 = new Employee();
			c3.setId(1);
			c3.setName("abc");
			
			
			ArrayList<Employee> cv = new ArrayList<Employee>();
			cv.add(c3);
			cv.add(c2);
			cv.add(c1);
			
			
			a cvcv = new a();
			
			Collections.sort(cv, new a());
			
			for(Employee xcv:cv)
			{
				System.out.println(xcv.getName()+xcv.getId());
				
			}
			
			
			
		
		
		

	}

	

}
