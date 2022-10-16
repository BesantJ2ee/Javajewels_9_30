package java_Oct_16;

public class Bangalore {
	//not static methods
	void xyz()
	{
		String x="JAPAK";
		//In build methods are ther in java
		//written by java people
		//lot of methods. very common usage methods
		
	//	System.out.println(x.length());
		
		String[] ac=x.split("");
		//0 -J
		//1  -A
		//2-P
		//3 -A
		//4 -N
		//length is 5
		//String[] ac = {"J","A","P","A","N"}
		//System.out.println(x.charAt(3));
		
	//	System.out.println(x.replace('J','K'));
	//System.out.println(x.replaceFirst("A","O"));
		
	//	System.out.println(x.replaceAll("A","O"));
		  
	//Boolean operation
		
		//System.out.println(x.startsWith("J"));
		
		//System.out.println(x.endsWith("N"));
	  //&& AND GATE
		
		//OR GATE
		// And gate in java represented by &&
		// or gate in java represented by ||
		
		//And gate
		//boolean expression1  boolean expression 2    result 
		//true                   true                 true
		//true                   false                false
		//false                  true                 false
		//false                  false                false
		
		        //Or gate
		//true                    true                 true
		//true                    false               true
	    //false                   true                 true
	   //false                   false                 false
		
		
		if(x.startsWith("J") || x.endsWith("N"))
		{
			
			System.out.println("it stats with J  AND END WITH n letters");	
		}else
		{
			System.out.println("it stats and not correct");
			
		}
		
	
		
	}
	int abc()
	{
		
	return 0;	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //class name  variable/refvariable  = new 
		
		//Bangalore(); it is called construct
		//used to create
		Bangalore jklknfsd= new Bangalore();
		
		//Calling the method from object
		//only when ur methods are not part of static
		jklknfsd.xyz();
		int c=jklknfsd.abc();
		//System.out.println(c);
		
		
	}

}
