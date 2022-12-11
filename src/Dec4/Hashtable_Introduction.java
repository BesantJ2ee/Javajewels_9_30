package Dec4;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Hashtable_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		  //Dictionary class used for thread safe
		 // hashtable,vector,
	        // Initialization of a Hashtable
	        // using Generics
	        Hashtable<Integer, String> ht2
	            = new Hashtable<Integer, String>();
	  
	        // Inserting the Elements
	        // using put() method
	        ht1.put(1, "one");
	        ht1.put(2, "two");
	        ht1.put(3, "three");
	        ht1.put(null, null);
	  
	        ht2.put(4, "four");
	        ht2.put(5, "five");
	        ht2.put(6, "six");
	  
	        // Print mappings to the console
	        System.out.println("Mappings of ht1 : " + ht1);
	        System.out.println("Mappings of ht2 : " + ht2);
	
	//At a time only one only process
	        //THread safe
	        //synronized application
	        //after adding completes
	        //then only remove will work
	        Hashtable<Integer, String> seatBerth
            = new Hashtable<Integer, String>();
	        seatBerth.put(2, "MB");
	        seatBerth.put(4, "SLB");
	        seatBerth.put(5, "SUB");
	        seatBerth.put(6, "UB");
	        seatBerth.put(8, "MB");
	        seatBerth.put(9, "SUB");
	
	        //THread safe
	      
	        //Addition of element and removal of element without locking
  ConcurrentHashMap<Integer, String> cm = 
		  new ConcurrentHashMap<Integer,String>();
  cm.put(2, "MB");
  cm.put(4, "LB");
  cm.put(5, "SUB");
  cm.put(7, "UB");
  
//THread safe
  //Addition of element and removal of element without locking
  
 CopyOnWriteArrayList<String> a1= new CopyOnWriteArrayList<String>();
 a1.add("tr");
 a1.add("fdfd");
	
 
 //What is Fail fast iterators
 //What is fail safe iterators
 //Read
 //Concurrency=> At a same time u need use add.remove, kind of operation
 
 //THread safe     and Not thread safe
 //DS comes under thread safe and not thread safe
	
	
	}

}
