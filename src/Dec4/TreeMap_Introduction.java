package Dec4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 TreeMap<Integer, String> sm= new TreeMap<Integer, String>();
	    sm.put(2, "practice");
	    sm.put(3, "quiz");
	    sm.put(5, "code");
	    sm.put(4, "contribute");
	    sm.put(2, "geeksforgeeks");
	    sm.put(2, "greek");
	    
	    LinkedHashMap<Integer, String> hj = 
	    		new LinkedHashMap<Integer, String>();
	    hj.put(40, "CAR");
	    hj.put(60, "SUV");
	    hj.put(100, "BUS");
	    hj.put(150, "TRUCK");
	   
	   
	    
	    
	    for (Integer gukgiuigu : hj.keySet()) {
	    //.out.println("key: " + gukgiuigu);
	    } 
	    // using values() for iteration over values
	    for (String url : hj.values()) {
	    //   System.out.println("value: " + url);
	    } 
        int hours = 2;
        int priceperHour=5;
        
        Scanner a1 = new Scanner(System.in);
        String sc= a1.next();
	    for (Map.Entry<Integer,String > xyz : hj.entrySet()) {
			
	    	if(xyz.getValue().equals(sc))
	    	{
	    		
	    		System.out.println(xyz.getKey()+
	    				(priceperHour*hours));
	    		
	    	}
	    	
			
		} 
	   
	 Iterator<Map.Entry<Integer, String>> xyz = hj.entrySet().iterator();
	    
	  while(xyz.hasNext())
	  {
	       Map.Entry<Integer, String> anyVariable = xyz.next();
	      
	     //  System.out.println("Key = " + anyVariable.getKey() + 
	 //                           ", Value = " + anyVariable.getValue());
	  }
	    
	    
	//hj.forEach((k,c) ->System.out.println("Key = "+ k + ", Value = " + c));
			
		
	}

}
