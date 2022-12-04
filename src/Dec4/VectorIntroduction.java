package Dec4;

import java.util.Vector;

public class VectorIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syncronoized purpose/application
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(3);
		
		v1.add(4);
		
		v1.add(6);
		
		
		Vector v2 = new Vector();
		
		
		
		
		
		
		int n = 5;
		  
        // Declaring the Vector with
        // initial size n
        Vector<Integer> v = new Vector<Integer>(n);
  
        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);
  
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the vector
        // after deletion
        System.out.println(v);
  
        // iterating over vector elements
        // using for loop
        for (int i = 0; i < v.size(); i++)
  
            // Printing elements one by one
            System.out.print(v.get(i) + " ");
        
        
        
        Vector v1 = new Vector();
        
        // Adding custom elements
        // using add() method
        v1.add(1);
        v1.add(2);
        v1.add("for");
        v1.add("oracle");
        v1.add(3);
        
        
        for (int i = 0; i < v.size(); i++) {
        	  
            System.out.print(v.get(i) + " ");
        }
  
        System.out.println();
  
        // Using the for each loop
        for (Integer str : v)
            System.out.print(str + " ");
  
        
        
	}

}
