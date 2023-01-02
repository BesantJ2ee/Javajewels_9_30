package Dec24_Exception;

public class Module17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{    
		    int data=100/0;  
		   }
		catch(ArithmeticException e)
		{
		System.out.println(e);
		
		} 
		int data1=100/5;
		System.out.println(data1);
		String s=null;  
		
		try{    
			System.out.println(s.length());  
		   }
		catch(NullPointerException e)
		{
		System.out.println(e);
		
		}
		
		String sr="abc";  
		int i=Integer.parseInt(sr);//NumberFormatException 
		
		try{    
			int K=Integer.parseInt(s) ; 
		   }
		catch(NumberFormatException e)
		{
		System.out.println(e);
		
		}
		
		
		
	}

}
