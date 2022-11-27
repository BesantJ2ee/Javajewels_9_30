package Nov26;


import java.util.ArrayList;

public class CollectionJava_Discussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //Generics
		ArrayList<String>  ssh = new ArrayList<String>(); 
		
	//	ArrayList<int>  ssh = new ArrayList<int>();  
		
		ArrayList<Integer>  ssh1 = new ArrayList<Integer>();  
		//Generics helps to segregate the data type
		
		ArrayList  ssh2 = new ArrayList();  
		ssh2.add("dsfsdfs");
		ssh2.add(78);
		
		
		ArrayList<Integer>  ssh3 = new ArrayList<Integer>(); 
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
		
		ArrayList<Integer>  ssh4 = new ArrayList<Integer>(); 
		//ssh4.addAll(ssh3);
		
		//System.out.println(ssh4);
		System.out.println(ssh3);	
		
		for(int i=0;i<ssh3.size();i++)
		{
			if(i<5) {
				ssh4.add(ssh3.get(i));	
			}
			
		}
		
		//ssh4.forEach(System.out::print);
		
		ssh4.forEach(a->System.out.print(a));
		
		//System.out.println(ssh4);	
		
		if(ssh3.containsAll(ssh4))
		{
			System.out.println("All elements are present");		
		}else {
			System.out.println("All elements are not present");	
		}
		
		
		
		
		
		
		ArrayList<Character>  sshcv = new ArrayList<Character>(); 
		sshcv.add('h');
		sshcv.add('a');
		sshcv.add('%');
		sshcv.add(')');
		sshcv.add(0, 's');
		
		
		//sshcv.clear();
		
		if(sshcv.isEmpty())
		{
			//System.out.println("The arraylist is empty");
			
		}else {
			//System.out.println("The arraylist is not empty");
		}
		
		//System.out.println(sshcv.size()+"The size of the array");
		
		sshcv.remove(0);
		
		//sshcv.
		
		for(Character a:sshcv)
		{
			//System.out.println(a);	
		}
		
		
		
		
		//System.out.println(ssh3);
		
		
		for(int i=0;i<ssh3.size();i++)
		{
		//	System.out.print(ssh3.get(i));
			
		}
		for(Integer a:ssh3)
		{
			//System.out.println(a);	
		}
		
		
		
		
		
	}

}
