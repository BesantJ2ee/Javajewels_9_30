package Nov20;

public class Module5Default {

	int[] abc()
	{
		int[] arrayObject= new int[2];		
		return arrayObject;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Module5Default cv = new Module5Default();
		int[] x1=cv.abc();
		for(int i=0;i<x1.length;i++)
		{
			System.out.println(x1[i]);			
		}
		
	
	}

}
