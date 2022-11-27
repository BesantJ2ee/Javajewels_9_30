package Nov26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDiscussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>  ssh2 = new ArrayList<Integer>(); 
		ssh2.add(45);
		
		List<Integer>  ssh3 = new LinkedList<Integer>(); 
		ssh3.add(45);
		ssh3.add(78);
		ssh3.add(78);
		ssh3.add(74);
		ssh3.add(71);
		ssh3.add(34);
		ssh3.add(54);
		ssh3.add(76);
		ssh3.add(904);
		ssh3.add(744);
		
		for(int i=0;i<ssh3.size();i++)
		{
			//System.out.println(ssh3.get(i));
		}
		
		
		HashSet<Integer>   ssh5 = new HashSet<Integer>();
		ssh5.add(56);
		ssh5.add(45);
		ssh5.add(78);
		ssh5.add(78);
		ssh5.add(74);
		ssh5.add(71);
		ssh5.add(34);
		ssh5.add(54);
		ssh5.add(76);
		ssh5.add(904);
		ssh5.add(744);
		for(Integer v: ssh5)
		{
		//	System.out.println(v);
		}
		
		
		TreeSet<Integer>  ssh6 = new TreeSet<Integer>();
		ssh6.add(4);
		ssh6.add(56);
		ssh6.add(45);
		ssh6.add(78);
		ssh6.add(78);
		ssh6.add(74);
		ssh6.add(71);
		ssh6.add(34);
		ssh6.add(54);
		ssh6.add(76);
		ssh6.add(904);
		ssh6.add(744);
		
		for(Integer v: ssh6)
		{
			//System.out.println(v);
		}
			
		LinkedHashSet<Integer> ssh7 = new LinkedHashSet<Integer>();
		ssh7.add(58);
		ssh7.add(4);
		ssh7.add(56);
		ssh7.add(45);
		ssh7.add(78);
		ssh7.add(904);
		ssh7.add(744);
		ssh7.add(78);
		ssh7.add(74);
		ssh7.add(71);
		ssh7.add(34);
		ssh7.add(54);
		ssh7.add(76);
		
		
		for(Integer v: ssh7)
		{
			System.out.println(v);
		}
		
		
	}
	
	

}
