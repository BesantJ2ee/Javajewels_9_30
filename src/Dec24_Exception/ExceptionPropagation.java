package Dec24_Exception;

public class ExceptionPropagation {
	//cpv()->xyz()->abc()
	//chaining
	//exception propagation
	void abc(){  //method declaration
	    int data=50/0; //exception criteria maintained 
	  }  
	  void xyz(){  
	    abc();// calling place  
	  }  
	  void cpv(){  
		  try{
			 // int data=50/0;
			    xyz();  
			   }
			   catch(Exception e)
			   {
				   System.out.println("exception handled");
				  } 
	  }  

	public static void main(String[] args) {
		
		
		ExceptionPropagation sfs = new ExceptionPropagation();
		sfs.cpv();
		
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
