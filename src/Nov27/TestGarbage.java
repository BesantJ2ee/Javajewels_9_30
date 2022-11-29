package Nov27;

public class TestGarbage {
	//Deprecated in 1.9 version
	 public void finalize()
	 {
		  	 	System.out.println("garbage collected");
	 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbageg1 s1=new Garbageg1();
		Garbageg1 s2=new Garbageg1();
		s1=null;
		s2=null;
		System.gc(); //Explicitly
		//Overriding the finalize method
		
		TestGarbage vb = new TestGarbage();
		vb.finalize();
		
		
		
		
	}

}
