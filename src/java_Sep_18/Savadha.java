package java_Sep_18;

public class Savadha {
	
	 boolean besant(String x, String y)
	{
	//String[] c=["A","B","C"]
		boolean x1=true;
		String[] splitter= x.split("");
		if(splitter[0].equals(y))
		{
			x1=true;
		}else
		{
			x1=false;
		}
		return x1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ABC";
		String inputChecking ="A";
		//Classs  //ref  //new //Consructor 
		                       //look similar to class name
		Savadha vshvshbd=new Savadha();
		
		
		vshvshbd.besant(a,inputChecking);
	}

}
