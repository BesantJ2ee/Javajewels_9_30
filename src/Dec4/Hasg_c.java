package Dec4;

import java.util.HashMap;

public class Hasg_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] vb = {{"00","01"},{"10","11"}};
		
		HashMap<String, String> nm = new HashMap<String, String>();
		
		for(int i=0;i<vb.length;i++)
		{
			for(int j=0;j<vb.length;j++) 
			{
			  
			//	System.out.print(vb[i][j]+" ");
				
				if(i==0 && j==0)
			    {
			    	nm.put(vb[i][j], vb[i][j+1]);  	
			    }
				if(i==1 && j==1)
			    {
			    	nm.put(vb[i-1][j], vb[i][j]);  	
			    }
			    
							
				
			}
			System.out.println(" ");
		}
	
	  for(String c:nm.keySet())
	  {
		System.out.println(c);  
		  
	  }
	  for(String c1:nm.values())
	  {
		System.out.println(c1);  
		  
	  }
	
	
	
	}

}
