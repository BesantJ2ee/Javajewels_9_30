package Dec4;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<ArrayList> set = new HashSet<>();
		  
        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
  
        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
  
        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
        
        System.out.println(set.size());
        
        
        
        HashSet<String> h = new HashSet<String>();
        
        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
  
        // Adding duplicate elements
        h.add("India");
  
        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));
        
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                           + h);
        
        

	}

}
