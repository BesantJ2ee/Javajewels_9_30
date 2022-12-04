package Dec4;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		names.add("ab");
		names.add("abv");
		names.add("abbn");
		names.add("abvbn");
		
		
		ListIterator<String> namesIterator
        = names.listIterator();

    // Traversing elements using next() method
    while (namesIterator.hasNext()) {
        System.out.println(namesIterator.next());
    }
    
    
    while (namesIterator.hasPrevious()) {
        System.out.println(namesIterator.previous());
    }

		
	}

}
