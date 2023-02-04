package JavaThread_04_02_2023;

public class Rectangle {

	//this ius the resource
	// non return method
			//i pass an integer argument
	synchronized void printTable(int n){  
		//loop  
		for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(800);  
		     }
		     catch(Exception e)
		     {
		    System.out.println(e);
		    }  
		   }  
	}
	
}
