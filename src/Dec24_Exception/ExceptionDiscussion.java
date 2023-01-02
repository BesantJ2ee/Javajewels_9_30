package Dec24_Exception;

public class ExceptionDiscussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
          int[] a= {1,2,3};
			
			for(int i=0;i<4;i++)
			{
				System.out.println("print"+a[i]);
				
			}	
		}catch(NumberFormatException se) {
			System.out.println(se.getMessage());
		}
		
		
		System.out.println("printafter");
		int a1=10;
		int b=20;
		System.out.println(a1+b);
	}

}
