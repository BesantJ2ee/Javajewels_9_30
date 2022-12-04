package Dec4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  ArrayList<Integer> a2=new ArrayList<Integer>();  
		  a2.add(4);  
		  a2.add(5);  
		  a2.add(5);  
		  a2.add(6);  
		  
		  Iterator<Integer> itr3=a2.iterator(); 
		  
		  while(itr3.hasNext()){  
			   System.out.println(itr.next());  
			  } 
		  
	}

}
