package java_Sep_18;

public class LogicForCharAt {
	
	static  String xyz(String c, int index)
	{
		String[] abc=c.split("");
		String a =abc[index];
	
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String abc="Bosnia"; 
		LogicForCharAt vb = new LogicForCharAt();
		vb.xyz(abc, 2);//method calling
		
		
		
	}

}
