package java_Sep_18;

public class Length {
	
	static int customLength(String abc)
	{
		String[] vb = abc.split("");
		int count=0; 
		for(int i=0;i<vb.length;i++)
		{
			if(i<vb.length) {
				
				count++;
			}	
		}
	return count;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String xc="Bangalore";
		String[] vb = xc.split("");
		
		System.out.println(vb.length);//one way
		System.out.println(customLength("Chennai"));//Custom length
		
	}

}
