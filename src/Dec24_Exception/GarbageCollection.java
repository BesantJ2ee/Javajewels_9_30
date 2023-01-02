package Dec24_Exception;

public class GarbageCollection {
	/*
	 * protected void finalize() {
	 * System.out.println("object is garbage collected"); }
	 */ 

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		GarbageCollection vbb1= new GarbageCollection();
		GarbageCollection vbb2= new GarbageCollection();
	//	vbb1=null;
	//	vbb2=null;
		vbb1.finalize();
		System.gc(); 
		vbb1.finalize();
	

	}

}
