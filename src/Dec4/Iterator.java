package Dec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
	
	void cvy(LinkedList<String> fsfjksjd)
	{
		//do some operation
		
		if(!fsfjksjd.isEmpty())
		{
			
			fsfjksjd.addLast("mskcfsdk");
			
		}else {
			
			//Exit the operation
		}
		
		
		
	}
	void abn(String fnsldsl)
	{
		if(fnsldsl!=null) {
			
		   fnsldsl.concat("abc");
				
		}
			
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cv1 ="uii";
		
		List<String> cv = Arrays.asList("uii","rtt","sdfdf");
		
		
		LinkedList<String> names2 = new LinkedList<>();
		  names2.add("uii");
	        names2.add("rtt");
	        names2.add("sdfdfe");
	        names2.add("sdfdf");

		 LinkedList<String> names = new LinkedList<>();
		  names.add("uii");
	        names.add("rtt");
	        names.add("sdfdf");
	        
	        Iterator bnm = new Iterator();   
	        bnm.cvy(names);
	        bnm.abn(cv1);
	        
	        
	      //  System.out.println("Before Linked List"+names);
	       // names.clear();
	       // System.out.println("After Linked List clear"+names);
	        //names.add(0, "gdgd");
	       // System.out.println("Add with index"+names);
	       // names.add(1, "adding");
	       // System.out.println("Add with 1 index"+names);
	        //names.addFirst("abc");
	       // names.addLast("xyz");
	       // System.out.println("addFirst and addLast"+names);
	        
	 //      System.out.println(names.hashCode());
	 //      System.out.println(names2.hashCode());
	        if(names.contains(names2))
	        {
	        	
	//        	System.out.println("All elements are there");	
	        	
	        }
	        else {
	        	
	//        	System.out.println("All elements are not there");
	        }
	       	        
	        if(names2.containsAll(names))
	        {
	        	
	        //	System.out.println("All elements are there using contans all");	
	        	
	        }
	        else {
	        	
	       // 	System.out.println("All elements are not there using contains all");
	        }    
	        
	        
	        
	        
		 
		 ArrayList<Integer> df = new ArrayList<Integer>();
		 df.add(12);
		 df.add(10);
		 df.add(14);
		 df.add(11);
		 
			 
	//	 System.out.println("Before"+df);
	    
		 
		 df.remove(2);
		 
		
		
		 
		// System.out.println("After"+df);
	      // Getting ListIterator
	        
		 
		 
		// ListIterator<String> itr= names2.listIterator();
	 
	        // Traversing elements using next() method
	     //   while (itr.hasNext()) {
	      //   System.out.println(itr.next());
	      //  }
	        
	      //  ListIterator<String> itr2= names2.listIterator();
	   	 
	        // Traversing elements using next() method
	       
	       //   System.out.println(itr2.hasNext());
	      //    System.out.println(itr2.hasPrevious());
	        
	          
	      //    ListIterator<String> itr5= names.listIterator();
	     	 
		        // Traversing elements using next() method
		  //      while (itr5.hasPrevious()) {
		  //       System.out.println(itr5.previous());
		 //       }
	        
	      
		
	}

}
