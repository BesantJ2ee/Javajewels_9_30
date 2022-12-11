package Dec11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Dec11.Employee;

class acx implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		//pass or return an integer
		//3 types of return value compare method is expecting
		//-1  ==> One object is less than with another object
		//1  ==> one object is greater than with another object
		//0 --> Means both object having same value, hashcode is same
		
		// I need print all the salary in descending format
		
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
			
		}else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		else {
			return 0;
		}
		

	}

	

	
	
}

public class ComparingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee c1 = new Employee();
		c1.setId(0);
		c1.setName("Xyz");
		c1.setSalary(100000);
		
		Employee c2 = new Employee();
		c2.setId(2);
		c2.setName("Xyzfgg");
		c2.setSalary(200000);
		
		Employee c3 = new Employee();
		c3.setId(1);
		c3.setName("abc");
		c3.setSalary(300000);
		
		//it will maintain insertion
		//based on 
		ArrayList<Employee> cv = new ArrayList<Employee>();
		cv.add(c1);
		
		cv.add(c3);
		cv.add(c2);
		
		
		
		acx cvcv = new acx();
		
		Collections.sort(cv, cvcv);
		
		for(Employee xcv:cv)
		{
			System.out.println(xcv);
			
		}
		
		
		
	}

}
