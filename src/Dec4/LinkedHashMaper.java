package Dec4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> sm
        = new LinkedHashMap<Integer, String>();
    sm.put(new Integer(2), "practice");
    sm.put(new Integer(3), "quiz");
    sm.put(new Integer(5), "code");
    sm.put(new Integer(4), "contribute");
    sm.put(new Integer(1), "geeksforgeeks");


   
    for (Map.Entry<Integer,String > xyz : sm.entrySet()) {
		
		System.out.println(xyz.getKey()+xyz.getValue());
	}
    
    
    for (Integer name : sm.keySet()) 
        System.out.println("key: " + name);
      
    // using values() for iteration over values
    for (String url : sm.values()) 
        System.out.println("value: " + url);
    
    
    Iterator<Map.Entry<Integer, String>> itr = sm.entrySet().
    
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
