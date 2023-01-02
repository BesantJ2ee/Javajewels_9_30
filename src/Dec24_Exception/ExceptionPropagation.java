package Dec24_Exception;

public class ExceptionPropagation {
	
	void abc(){  
	    int data=50/0;  
	  }  
	  void xyz(){  
	    abc();  
	  }  
	  void cpv(){  
	   try{  
	    xyz();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

	public static void main(String[] args) {
		
		
		ExceptionPropagation sfs = new ExceptionPropagation();
		sfs.cpv();
		
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
