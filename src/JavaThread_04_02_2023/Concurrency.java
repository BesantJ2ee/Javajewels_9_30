package JavaThread_04_02_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Concurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//STUDENT => 3 DIFFERENT Subject
		//Student name-> Kevin,mason,Henderson
		//> Physics, chemistry,maths
		//.physics, biologiy ,humanities
		//mathematics,english,history
		
		String[] combintion1= {"Physics", "chemistry","maths"};
		String[] combintion2= {"Physics", "biologiy","humanities"};
		String[] combintion3= {"mathematics", "english","history"};
		List<String> cb1 = new LinkedList<String>();
		cb1.add("Physics");
		cb1.add("chemistry");
		cb1.add("maths");
		
		List<String> cb2 = new LinkedList<String>();
		cb2.add("Physics");
		cb2.add("chemistry");
		cb2.add("maths");
		
		List<String> cb3 = new LinkedList<String>();
		cb3.add("Physics");
		cb3.add("chemistry");
		cb3.add("maths");
		
		Map<String, List<String>> studentMap1 = new HashMap<String, List<String>>();
		studentMap1.put("Kevin", cb1);
		studentMap1.put("THomas", cb2);
		studentMap1.put("henderson", cb3);
		
		for(Map.Entry<String, List<String>> vbn:studentMap1.entrySet())
		{
			System.out.println("Key   "+vbn.getKey());
			for(String x1:vbn.getValue())
			{
				System.out.println("Value  "+x1+" ME");	
			}
			
			
		
		}
		
		 for (String name : studentMap1.keySet()) {
		    //    System.out.println("Student map key: " + name);
		    }
		 
		 for (List<String> listVariable : studentMap1.values()) {
		        
			 //System.out.println("subject names "+listVariable);
			 for(String x1:listVariable)
		        {
		        	//System.out.println("subject names "+x1);
		        }
		    }
		    
		Map<String, String[]> studentMap = new HashMap<String, String[]>();
		studentMap.put("Kevin",combintion1);
		studentMap.put("Mason",combintion2);
		studentMap.put("Henderson",combintion3);
		
		Map<Integer, String> cityCode1 = new HashMap<Integer, String>(); 
		 cityCode1.put(1, "India"); 
		 cityCode1.put(2, "USA"); 
		
		for(Map.Entry<Integer, String> vbn:cityCode1.entrySet())
		{
		//	System.out.println("Key   "+vbn.getKey()+"Value  "+vbn.getValue());
		}
		
		
		
		Map<String, String> cityCode = new HashMap<String, String>(); 
	        cityCode.put("Delhi", "India"); 
	        cityCode.put("Moscow", "Russia"); 
	        cityCode.put("New York", "USA"); 
	  
	        Iterator iterator = cityCode.keySet().iterator(); 
	  
	        while (iterator.hasNext()) { 
	           // System.out.println(cityCode.get(iterator.next())); 
	  
	            // adding an element to Map 
	            // exception will be thrown on next call 
	            // of next() method. 
	            cityCode.put("Istanbul", "Turkey"); 
	        } 
	}

}
