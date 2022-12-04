package Dec4;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, String> sm
        = new TreeMap<Integer, String>();
    sm.put(4, "practice");
    sm.put(3, "quiz");
    sm.put(2, "code");
    sm.put(1, "contribute");
    sm.put(null, "contribute");
   

   
    for (Map.Entry<Integer,String > xyz : sm.entrySet()) {
		
	System.out.println(xyz.getKey()+xyz.getValue());
	}
    
    
    for (Integer name : sm.keySet()) 
     //   System.out.println("key: " + name);
      
    // using values() for iteration over values
    for (String url : sm.values()) 
    {
    	
    //	System.out.println("value: " + url);	
    }
        
    
    
   
    Iterator<Map.Entry<Integer, String>> itr =  sm.entrySet().iterator();
    
    while(itr.hasNext())
    {
         Map.Entry<Integer, String> entry = itr.next();
    //     System.out.println("Key = " + entry.getKey() + 
     //                        ", Value = " + entry.getValue());
    }
    
    
   // sm.forEach((k,v) -> System.out.println("Key = "
   //         + k + ", Value = " + v));
    
    
		
	}

}
