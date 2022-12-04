package Dec4;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;

public class Enumerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.add("ab");
		names.add("abv");
		names.add("abbn");
		names.add("abvbn");
		
		
		
		
		Enumeration<String> e = Collections.enumeration(names);
		
		
		System.out.println("\nEnumeration over list: ");
		
		while (e.hasMoreElements())
            System.out.println("Value is: " + e.nextElement());
		
	}

}
