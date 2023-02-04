package JavaThread_04_02_2023;
//A non-static class that is created 
//inside a class but outside a method is called 
//member inner class. 
//It is also known as a regular inner class
public class OuterClassExample {
	private int data=30;  
	 class Inner{  
	  void msg()
	  {System.out.println("data is "+data);
	  }	  
	 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClassExample in = new OuterClassExample();
		OuterClassExample.Inner inn= in.new Inner();
		inn.msg();
	}

}
