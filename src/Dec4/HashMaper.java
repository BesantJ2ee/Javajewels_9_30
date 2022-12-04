package Dec4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer, String> sm
        = new HashMap<Integer, String>();
    sm.put(1, "practice");
    sm.put(2, "quiz");
    sm.put(3, "code");
    sm.put(5, "contribute");
    
    Employee z1 = new Employee();
    z1.setId(12);
    z1.setName("Hhhh");
    
    Employee z2 = new Employee();
    z1.setId(12);
    z1.setName("xcvbh");
    
    
    ArrayList<Employee> cvnnsd1= new ArrayList<Employee>();
    cvnnsd1.add(z2);
    
    
    ArrayList<Employee> cvnnsd= new ArrayList<Employee>();
    cvnnsd.add(z1);
    
    
    HashMap<String, ArrayList<Employee>> groupOfEmp= 
    		new HashMap<String, ArrayList<Employee>>();
    groupOfEmp.put("Manager", cvnnsd);
    groupOfEmp.put("Engineer", cvnnsd1);

    
    
    
    
    HashMap<Integer, Employee> sr= 
    		new HashMap<Integer, Employee>();
    sr.put(7, z1);
    
    
    HashMap<Integer, ArrayList<Employee>> se= 
    		new HashMap<Integer, ArrayList<Employee>>();
    se.put(7, cvnnsd);


   
    for (Map.Entry<Integer,String > xyz : sm.entrySet()) {
		
		System.out.println(xyz.getKey()+" "+xyz.getValue());
	}
    
    
    for (Integer name : sm.keySet()) {
        System.out.println("key: " + name);
    }
    // using values() for iteration over values
    for (String url : sm.values()) {
        System.out.println("value: " + url);
    
    }
   
    Iterator<Map.Entry<Integer, String>> itr = sm.entrySet().iterator();
    
    while(itr.hasNext())
    {
         Map.Entry<Integer, String> entry = itr.next();
         System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
    }
    
    
    sm.forEach((k,v) -> System.out.println("Key = "
            + k + ", Value = " + v));
		
		
	}

}
