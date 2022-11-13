package November13;

public class Matrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[][] a = {{10,20},{20,30}};
		
	String[][] a1 = {{"A","B","E"},{"C","D","E"}};
	
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a.length;j++)
	  {
		  if(i==j)
		  {
			  System.out.print(a[i][j]+" "); 
			 
		  }
		
	  }
		
		System.out.println(" ");
	}
	
	
	

	}

}
