package Nov27;

import java.util.ArrayList;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1 = new Address();
		ad1.setBuildingname("FORUM");
		ad1.setCity("Bangalore");
		ad1.setRoadName("Queens Road");
		ad1.setStateName("Karanatka");
		
		Address ad2 = new Address();
		ad2.setBuildingname("PRESTIGE");
		ad2.setCity("Chennai");
		ad2.setRoadName("Poonamale Road");
		ad2.setStateName("Tamil Nadu");
		
		
		Address ad3 = new Address();
		ad3.setBuildingname("BRIGADE");
		ad3.setCity("Mumbai");
		ad3.setRoadName("Church gate road");
		ad3.setStateName("Maharashtra");
		
		
		Address ad4 = new Address();
		ad4.setBuildingname("EMBASSY");
		ad4.setCity("kolkata");
		ad4.setRoadName("victoria road");
		ad4.setStateName("West Bengal");
		
		

		Employee e1 = new Employee();
		e1.setName("Anil");
		e1.setSalary(1000000);
		e1.setAge(23);
		e1.setGender("Male");
		e1.setBankName("KOTAK");
		e1.setAddress(ad1);
			
		Employee e2 = new Employee();
		e2.setName("shashank");
		e2.setSalary(2000000);
		e2.setAge(24);
		e2.setGender("Male");
		e2.setBankName("SBI");
		e2.setAddress(ad2);
		
		Employee e3 = new Employee();
		e3.setName("susan");
		e3.setSalary(4000000);
		e3.setAge(33);
		e3.setGender("Female");
		e3.setBankName("ICICI");
		e3.setAddress(ad3);
		
		Employee e4 = new Employee();
		
		e4.setName("Tessa");
		e4.setSalary(3000000);
		e4.setAge(23);
		e4.setGender("Female");
		e4.setBankName("IDBI");
		e4.setAddress(ad4);
		
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		
		//Advanced loop
		for(Employee x : a1)
		{			
			System.out.println(x);
		}
		
		
		
		
	}

}
