package Dec17;
 abstract class a 
{
	//abstract method
	abstract void xyz();
	
	//Normal method/ non return method
	void fg()
	{
		
	}
	//return method
	int c()
	{
		return 10;
	}
	
	static void x()
	{
		
	}
	
	
}




//interface will be implementes in the class
//abstract class then it will extend
 
//interface will be implements keyword used in the class
// abstract class will be using extends keyword in the class
 //Difference btw interface and abstract
 //Default methods not allowed in absract class 
 //but allowed in interfaces
 //he abstract method xyc in type abcd can only set a visibility modifier, 
 //one of public or protected
public class Classtest extends a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	//If the class is abstract then you will 
		//not create object for that class	
//	a a5 = new a();
	
		Classtest cv = new Classtest();
		cv.c();
		cv.fg();
	}
	
	

	@Override
	void xyz() {
		// TODO Auto-generated method stub
		//you can write the logic for abstract
	}

	

	
	
	

}
